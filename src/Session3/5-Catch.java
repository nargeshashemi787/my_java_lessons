package Session3;

class Catch {




        public static void main(String[] args) {
            try {
                int x = 10 / 0; // خطا: تقسیم بر صفر
            } catch (Exception e) {
                System.out.println("یک خطایی رخ داد: " + e.getMessage());
            }
        }
    }
