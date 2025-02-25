public class PrintMegaBytesAndKiloBytes {

//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        if (kiloBytes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            int result = (kiloBytes * 1024) % kiloBytes;
//            System.out.println(result);
//        }
//    }
//   2500 KB = 2 MB and 452 KB

    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
        return remainder;
    }
}
//   2500 KB = 2 MB and 452 KB