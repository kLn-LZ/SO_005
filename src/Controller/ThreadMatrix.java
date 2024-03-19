package Controller;

public class ThreadMatrix extends Thread {
         private int[] vet;
         private int idLine;

        public ThreadMatrix(int[] vet, int idLine) {

            this.vet = vet;
            this.idLine = idLine;
        }

        @Override
        public void run() {
            calc();

        }

        private void calc() {
            int sum = 0;

            for(int v: vet) {

                sum = sum + v;

            }

            System.out.println("TID #" + getId() + " Result: " + sum + " | Line ID " + idLine);
        }
    }


