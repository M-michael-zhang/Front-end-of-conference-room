package com.arcsoft.room;

import java.util.List;

public class WorkerBean {
    /**
     * code : 200
     * msg : asddawd
     * extras : {"users":[{"id":1,"username":"username_1","realName":"小绿","phone":"12345678910","email":"beryl@brunhild.com","photoPath":"userPhoto/1.png","department":{"id":5,"name":"人力部"}},{"id":2,"username":"username_2","realName":"小蓝","phone":"1234567890","email":"sapphire@brunhild.com","photoPath":"userPhoto/2.png","department":{"id":2,"name":"开发部"}},{"id":3,"username":"username_3","realName":"永乐","phone":"1234567890","email":"joseph@brunhild.com","photoPath":"userPhoto/3.png","department":{"id":2,"name":"开发部"}},{"id":4,"username":"username_4","realName":"灰羽","phone":"1234567890","email":"raven@brunhild.com","photoPath":"userPhoto/4.png","department":{"id":1,"name":"测试部"}},{"id":5,"username":"username_5","realName":"一维","phone":"1234567890","email":"ace@brunhild.com","photoPath":"userPhoto/5.png","department":{"id":2,"name":"开发部"}},{"id":6,"username":"username_6","realName":"边境","phone":"1234567890","email":"border@brunhild.com","photoPath":"userPhoto/6.png","department":{"id":6,"name":"市场部"}},{"id":7,"username":"username_7","realName":"小亚麻","phone":"1234567890","email":"flax@brunhild.com","photoPath":"userPhoto/7.png","department":{"id":6,"name":"市场部"}},{"id":8,"username":"username_8","realName":"白槿","phone":"1234567890","email":"weiss@brunhild.com","photoPath":"userPhoto/8.png","department":{"id":6,"name":"市场部"}},{"id":9,"username":"username_9","realName":"启明","phone":"1234567890","email":"charon@brunhild.com","photoPath":"userPhoto/9.png","department":{"id":5,"name":"人力部"}},{"id":10,"username":"username_10","realName":"极光","phone":"1234567890","email":"solar@brunhild.com","photoPath":"userPhoto/10.png","department":{"id":1,"name":"测试部"}}]}
     */

    private int code;
    private String msg;
    private ExtrasBean extras;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ExtrasBean getExtras() {
        return extras;
    }

    public void setExtras(ExtrasBean extras) {
        this.extras = extras;
    }

    public static class ExtrasBean {
        private List<UsersBean> users;

        public List<UsersBean> getUsers() {
            return users;
        }

        public void setUsers(List<UsersBean> users) {
            this.users = users;
        }

        public static class UsersBean {
            /**
             * id : 1
             * username : username_1
             * realName : 小绿
             * phone : 12345678910
             * email : beryl@brunhild.com
             * photoPath : userPhoto/1.png
             * department : {"id":5,"name":"人力部"}
             */

            private int id;
            private String username;
            private String realName;
            private String phone;
            private String email;
            private String photoPath;
            private DepartmentBean department;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhotoPath() {
                return photoPath;
            }

            public void setPhotoPath(String photoPath) {
                this.photoPath = photoPath;
            }

            public DepartmentBean getDepartment() {
                return department;
            }

            public void setDepartment(DepartmentBean department) {
                this.department = department;
            }

            public static class DepartmentBean {
                /**
                 * id : 5
                 * name : 人力部
                 */

                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
