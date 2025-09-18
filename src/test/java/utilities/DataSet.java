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
                {"", "", "", "", "", "Error: অনুগ্রহ করে সঠিক ইমেইল প্রদান করুন"},
                {"", "01733658961", "kosojeg351@ishense.com", "12345678", "12345678", "নাম প্রয়োজন"},
                {"TestDemo", "", "kosojeg351@ishense.com", "12345678", "12345678", " Error: ফোন নাম্বার প্রয়োজন!."},
                {"TestDemo", "01733658961", "", "12345678", "12345678", "Error: অনুগ্রহ করে সঠিক ইমেইল প্রদান করুন"},
                {"TestDemo", "01733658961", "kosojeg351@ishense.com", "", "12345678", "Error: অনুগ্রহ করে আপনার পাসওয়ার্ড প্রদান করুন"},
                {"TestDemo", "01733658961", "kosojeg351@ishense.com", "12345678", "123456789", "Error: পাসওয়ার্ড মিলতেছে না"},
                {"TestDemo", "01733658961", "kosojeg351@ishense.com", "12345678", "", "Error: পাসওয়ার্ড মিলতেছে না"}


//Error: The password you entered for the email address bimoke9741@dpwev.com is incorrect. Lost your password?
        };
        return data;
    }
}
