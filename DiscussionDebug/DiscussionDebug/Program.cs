using System;
namespace DiscussionDebug
{
    class Program
    {
        static void Main(string[] args)
        {
            (new Program()).run();
        }
        void run()
        {
            double dailyRate = readDouble("Enter your daily rate: "); //cannot convert string to int
            int noOfDays = readInt("Enter the number of days: ");
            writeFee(calculateFee(dailyRate, noOfDays));
        }
        private void writeFee(double p) //delete int n
        {
            Console.WriteLine("The consultant's fee is:  {0}", p * 1.1);
        }
        private double calculateFee(double dailyRate, int noOfDays) //fixed the semicolon
        {           
            return dailyRate* noOfDays;
        }
        private int readInt(string p) //changed to int
        {
            Console.Write(p);
            string line = Console.ReadLine();
            return int.Parse(line);
        }
        private double readDouble(string p) //read string p instead of int
        {
            Console.Write(p);
            string line = Console.ReadLine();
            return double.Parse(line);
        }
    }
}
