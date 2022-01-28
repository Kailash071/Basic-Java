class otpGenerator {

    public int generateOtp(int digit) {
        int range = (int) Math.pow(10, digit) - 1 - (int) Math.pow(10, digit - 1) + 1;

        return (int) (Math.random() * range) + 1;
        //return (int) (math.random() * (999999-100000+1))+1   //for 6 digit
        //return (int) (math.random() * (999-100+1))+1   //for 3 digit
        //return (int) (math.random() * (10-1+1))+1   //between 1-10 digit 
        }
    public static void main(String[] args) {
        otpGenerator main = new otpGenerator();
        System.out.println(main.generateOtp(4));
        System.out.println(main.generateOtp(4));
        System.out.println(main.generateOtp(4));
        System.out.println(main.generateOtp(6));
        System.out.println(main.generateOtp(6));
        System.out.println(main.generateOtp(6));
    }
}