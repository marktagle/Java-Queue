import java.util.*;
    class Queue {
          public static LinkedList <String> lst1 = new LinkedList <String>();
          public static String m = ""; public static int n = 0;
          public static Scanner scan = new Scanner(System.in);
      public static void main(String []args) {
               holder();
         }
        public static void holder() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Enqueue\n2,Dequeue\n3,Peek\n4,Exit\n");
            System.out.println("Choose from 1-4");
            n=scan.nextInt();

            if(n==1) {
                Enqueue();
            }
            else if(n==2) {
                Dequeue();
            }
            else if(n==3) {
                peek();
            }
            else if(n==4) {
                System.exit(0);
            }
        }
        public static void Enqueue() {
            System.out.print("Enter a string: ");
            m=scan.nextLine();
            lst1.addLast(m);
            System.out.println(lst1);
            holder();
        }
        public static void Dequeue() {
            lst1.removeFirst();
            System.out.println(lst1);
        }
        public static void peek() {
            System.out.println(lst1.peek());
        }
    }
