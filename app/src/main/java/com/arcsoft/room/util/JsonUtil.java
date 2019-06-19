package com.arcsoft.room.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.arcsoft.room.Meet;
import com.arcsoft.room.MyBean;
import com.arcsoft.room.R;
import com.arcsoft.room.WorkerBean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JsonUtil {
    private static OkHttpClient client = new OkHttpClient();
    public ArrayList<String> list = new ArrayList<String>();
    public static ArrayList<Meet> getData() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://111.231.70.170:8000/room/meetings?id=12").build();
        MyBean resultBean = new MyBean();
        try {
            Response response = client.newCall(request).execute();//发送请求
            String result = response.body().string();

            JsonObject jsonObject = new JsonParser().parse(result).getAsJsonObject();

            resultBean = new Gson().fromJson(jsonObject,MyBean.class);
//                    JsonArray jsonArray = jsonObject.getAsJsonArray("meetings");
//                    System.out.println(resultBean.getExtrax());


        } catch (IOException e) {
            e.printStackTrace();
        }
        String now_date="";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
        now_date=sdf.format(dt).substring(0,10);
        ArrayList<Meet> myMeet = new ArrayList<Meet>();
        Meet temp;
        String temp_s;
        for(int i = 0;i<resultBean.getExtras().getMeetings().size();i++){
            if(resultBean.getExtras().getMeetings().get(i).getStartTime().substring(0,10).equals(now_date))
            {
                temp = new Meet();
                temp_s=resultBean.getExtras().getMeetings().get(i).getStartTime().substring(11,16);
                temp_s+="-";
                temp_s+=resultBean.getExtras().getMeetings().get(i).getEndTime().substring(11,16);
                temp.setMeetTime(temp_s);
                temp.setMeetName(resultBean.getExtras().getMeetings().get(i).getName());
                myMeet.add(temp);
            }
        }
        return myMeet;
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(getData());
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://111.231.70.170:8000/user/all").build();
        WorkerBean resultBean = new WorkerBean();
        try {
            Response response = client.newCall(request).execute();//发送请求
            String result = response.body().string();

            JsonObject jsonObject = new JsonParser().parse(result).getAsJsonObject();

            resultBean = new Gson().fromJson(jsonObject,WorkerBean.class);
            System.out.println(resultBean.getExtras().getUsers().size());
            System.out.println(resultBean.getExtras().getUsers().get(0).getPhotoPath().substring(10));
            ArrayList<String> photoname = new ArrayList<String>();
            for(int i = 0;i<resultBean.getExtras().getUsers().size();i++){
                System.out.println(resultBean.getExtras().getUsers().get(i).getPhotoPath().substring(10));
                photoname.add(resultBean.getExtras().getUsers().get(i).getPhotoPath().substring(10));
//                        showToast(resultBean.getExtras().getUsers().get(i).getPhotoPath().substring(10));
//                        updateFace(resultBean.getExtras().getUsers().get(i).getPhotoPath().substring(10));
            }
//                    JsonArray jsonArray = jsonObject.getAsJsonArray("meetings");
//                    System.out.println(resultBean.getExtrax());

            updateFace(photoname);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//
//    private Handler mHandler = new Handler(){
//        @Override
//        public void handleMessage(Message msg){
//            if(msg.what==1){
//                String ReturnMessage = (String) msg.obj;
//            }
//
//        }
//    };
    private static void updateFace(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {

            try {
                //对资源链接
                URL url = new URL("http://111.231.70.170:8000/userPhoto/" + names.get(i));
                InputStream inputStream = url.openStream();
                //对网上资源进行下载转换位图图片
//            Bitmap bitmap;
//            bitmap= BitmapFactory.decodeStream(inputStream);
//            inputStream.close();

                //再一次打开
                inputStream = url.openStream();
                String sb = names.get(i);
                String final_name = sb.replace("png", "jpg");
                File file = new File("D:\\test\\" + final_name);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                int hasRead = 0;
                while ((hasRead = inputStream.read()) != -1) {
                    fileOutputStream.write(hasRead);
                }
                fileOutputStream.close();
                inputStream.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void checkRegister(String uid)  {
         final OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder().url("http://111.231.70.170:8000/meeting/register?roomId=12&userId="+uid).build();
        //新建一个线程，用于得到服务器响应的参数
        new Thread(new Runnable() {
            @Override
            public void run() {
                Response response = null;
                try {
                    //回调
                    response = client.newCall(request).execute();
                    if (response.isSuccessful()) {
                        //将服务器响应的参数response.body().string())发送到hanlder中，并更新ui
//                        mHandler.obtainMessage(1, response.body().string()).sendToTarget();


                        ;String result = response.body().string();
                        System.out.println(result);
                        JsonObject jsonObject = new JsonParser().parse(result).getAsJsonObject();

                        System.out.println(jsonObject.getAsJsonPrimitive("msg").toString());

                    } else {
                        throw new IOException("Unexpected code:" + response);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
