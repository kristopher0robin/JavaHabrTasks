package Task05_Vector;

public class Vector {

        // 3 приватных поля
        private double x;
        private double y;
        private double z;

        // конструктор с параметрами x, y, z
        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // длина вектора, корень из суммы квадратов
        public double vectorLength() {
            return Math.sqrt(x*x + y*y + z*z);
        }

        // скалярное произведение
        public double innerProduct(Vector vector) {
            return x * vector.x + y * vector.y + z * vector.z;
        }

        // векторное произведение
        public Vector vectorProduct(Vector vector) {
            return new Vector(
                    y * vector.z - z * vector.y,
                    z * vector.x - x * vector.z,
                    x * vector.y - y * vector.x);
        }

        public static Vector[] generate(int n){
            Vector[] vectors = new Vector[n];
            for(int i =0; i < n; i++){
                vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
            }
            return vectors;
        }

        public static void main(String[] args){
            Vector[] vectors = Vector.generate(10);
            System.out.println(vectors[0]);
            System.out.println(vectors[1]);
            System.out.println("Длина вектора: " + vectors[0].vectorLength());
            System.out.println("Скалярное проивзведение: " + vectors[0].innerProduct(vectors[1]));
            System.out.println("Векторное произведение: " + vectors[0].vectorProduct(vectors[1]));
        }
}

