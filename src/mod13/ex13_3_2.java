//package mod13;
//import java.lang.reflect.Method;
//
//public class ex13_3_2 {
//
//
//    public class Main extends Thread {
//        // Launch the show() method from the class Advertisement
//        // (it's hidden) in a new Thread
//        public static void main(String[] args) {
//            Testt t1 = new Testt();
//            t1.start();
//        }
//    }
//
//    class Testt extends Thread {
//        Advertisement a1 = new Advertisement();
//
//        @Override
//        public void run() {
//            try {
//
//                Method method = Advertisement.class.getDeclaredMethod("show");
//                method.setAccessible(true);
//                method.invoke(a1);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
