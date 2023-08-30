class practicesta {
        int id;
        String name;
        String course_name;
        static String school_name;

        public practicesta(int id,String name){
            this("BCA");
            this.id=id;
            this.name=name;
        }
        public practicesta(String course_name){
            this.course_name=course_name;
        }

        public void display(){
            System.out.println(this.id);
        }
    }
