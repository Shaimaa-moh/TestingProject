package Main_App;

public class CourseStudent {
    String url1[]={"https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668/",
            "www.google.com","www.youtube.com"};

    public String checkLink(String url)
    {
        for(int i=0;i< url1.length;i++)
        {
            if(url.equals(url1[i]))
                return "valid";
        }
        return "INVALID";
    }
}
