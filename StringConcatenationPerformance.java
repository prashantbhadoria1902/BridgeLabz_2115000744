public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int[] testSizes = {1000, 10000, 1000000};

        for (int size : testSizes) {
            System.out.println("Test size: " + size);

            // String
            long startTime = System.nanoTime();
            String str = "";
            for (int i = 0; i < size; i++) {
                str += "a";
            }
            long endTime = System.nanoTime();
            System.out.println("String: " + (endTime - startTime) / 1000000 + "ms");

            // StringBuilder
            startTime = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append("a");
            }
            endTime = System.nanoTime();
            System.out.println("StringBuilder: " + (endTime - startTime) / 1000000 + "ms");

            // StringBuffer
            startTime = System.nanoTime();
            StringBuffer sf = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sf.append("a");
            }
            endTime = System.nanoTime();
            System.out.println("StringBuffer: " + (endTime - startTime) / 1000000 + "ms");

            System.out.println();
        }
    }
}

