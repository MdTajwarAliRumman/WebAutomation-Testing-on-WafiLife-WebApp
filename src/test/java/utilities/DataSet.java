package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "invalidCredentialsSet")
    public static Object invalidUserCredentials() {

        Object[][] data = {
                {"", "", "Error: ইউজার নাম প্রয়োজন"},
                {"bimoke9741@dpwev.com", "123456", "The password you entered for the email address"},
                {"nogases958@lanip", "12345678", "Unknown email address. Check again or try your use"},
                {"bimoke9741@dpwev.com", "", "Error: The password field is empty."},
                {"", "12345678", "Error: ইউজার নাম প্রয়োজন"},
//Error: The password you entered for the email address bimoke9741@dpwev.com is incorrect. Lost your password?
        };
        return data;
    }

    //    Error: এই ইমেইল অ্যাড্রেস দিয়ে ইতিমধ্যে একটি অ্যাকাউন্ট খোলা হয়েছে। অনুগ্রহ করে নতুন ইমেইল অ্যাড্রেস ব্যবহার করুন অথবা লগইন করুন
    @DataProvider(name = "invalidRegisterCredentialsSet")
    public static Object invalidRegisterCredentials() {

        Object[][] data = {
                {"", "", "Error: ইউজার নাম প্রয়োজন"},
                {"bimoke9741@dpwev.com", "123456", "The password you entered for the email address"},
                {"nogases958@lanip", "12345678", "Unknown email address. Check again or try your use"},
                {"bimoke9741@dpwev.com", "", "Error: The password field is empty."},
                {"", "12345678", "Error: ইউজার নাম প্রয়োজন"},
//Error: The password you entered for the email address bimoke9741@dpwev.com is incorrect. Lost your password?
        };
        return data;
    }
}
