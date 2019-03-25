package com.arcsoft.room;

import java.util.List;

public class MyBean {
    /**
     * code : 200
     * msg : aawaas
     * extras : {"meetings":[{"id":771,"name":"伯伦希尔新闻发布会","leader":{"id":1,"username":"username_1","realName":"小绿","password":"4c648388bc5880a9af17835d16439fe3","phone":"12345678910","email":"beryl@brunhild.com","photoPath":"wdasdasd"},"room":{"id":12,"name":"21-202","location":"21","capacity":15,"available":true,"microphoneAvailable":true,"projectorAvailable":true},"routineId":2,"startTime":"2019-03-10 07:40:00","endTime":"2019-03-10 08:30:00","state":1,"description":"wasdsd"},{"id":772,"name":"伯伦希尔新闻发布会","leader":{"id":1,"username":"username_1","realName":"小绿","password":"4c648388bc5880a9af17835d16439fe3","phone":"12345678910","email":"beryl@brunhild.com","photoPath":"awdasdas"},"room":{"id":12,"name":"21-202","location":"21","capacity":15,"available":true,"microphoneAvailable":true,"projectorAvailable":true},"routineId":1,"startTime":"2019-03-10 08:40:00","endTime":"2019-03-10 09:30:00","state":1,"description":"asdadwa"}]}
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
        private List<MeetingsBean> meetings;

        public List<MeetingsBean> getMeetings() {
            return meetings;
        }

        public void setMeetings(List<MeetingsBean> meetings) {
            this.meetings = meetings;
        }

        public static class MeetingsBean {
            @Override
            public String toString() {
                return "MeetingsBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", leader=" + leader +
                        ", room=" + room +
                        ", routineId=" + routineId +
                        ", startTime='" + startTime + '\'' +
                        ", endTime='" + endTime + '\'' +
                        ", state=" + state +
                        ", description='" + description + '\'' +
                        '}';
            }

            /**
             * id : 771
             * name : 伯伦希尔新闻发布会
             * leader : {"id":1,"username":"username_1","realName":"小绿","password":"4c648388bc5880a9af17835d16439fe3","phone":"12345678910","email":"beryl@brunhild.com","photoPath":"wdasdasd"}
             * room : {"id":12,"name":"21-202","location":"21","capacity":15,"available":true,"microphoneAvailable":true,"projectorAvailable":true}
             * routineId : 2
             * startTime : 2019-03-10 07:40:00
             * endTime : 2019-03-10 08:30:00
             * state : 1
             * description : wasdsd
             */

            private int id;
            private String name;
            private LeaderBean leader;
            private RoomBean room;
            private int routineId;
            private String startTime;
            private String endTime;
            private int state;
            private String description;

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

            public LeaderBean getLeader() {
                return leader;
            }

            public void setLeader(LeaderBean leader) {
                this.leader = leader;
            }

            public RoomBean getRoom() {
                return room;
            }

            public void setRoom(RoomBean room) {
                this.room = room;
            }

            public int getRoutineId() {
                return routineId;
            }

            public void setRoutineId(int routineId) {
                this.routineId = routineId;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public static class LeaderBean {
                /**
                 * id : 1
                 * username : username_1
                 * realName : 小绿
                 * password : 4c648388bc5880a9af17835d16439fe3
                 * phone : 12345678910
                 * email : beryl@brunhild.com
                 * photoPath : wdasdasd
                 */

                private int id;
                private String username;
                private String realName;
                private String password;
                private String phone;
                private String email;
                private String photoPath;

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

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
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
            }

            public static class RoomBean {
                /**
                 * id : 12
                 * name : 21-202
                 * location : 21
                 * capacity : 15
                 * available : true
                 * microphoneAvailable : true
                 * projectorAvailable : true
                 */

                private int id;
                private String name;
                private String location;
                private int capacity;
                private boolean available;
                private boolean microphoneAvailable;
                private boolean projectorAvailable;

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

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }

                public boolean isAvailable() {
                    return available;
                }

                public void setAvailable(boolean available) {
                    this.available = available;
                }

                public boolean isMicrophoneAvailable() {
                    return microphoneAvailable;
                }

                public void setMicrophoneAvailable(boolean microphoneAvailable) {
                    this.microphoneAvailable = microphoneAvailable;
                }

                public boolean isProjectorAvailable() {
                    return projectorAvailable;
                }

                public void setProjectorAvailable(boolean projectorAvailable) {
                    this.projectorAvailable = projectorAvailable;
                }
            }
        }
    }
}
