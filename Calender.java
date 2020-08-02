public static String findDay(int month, int day, int year) {
        int sum=0;
        String s="";
        int temp=year;
        int a=0;
        int rem=0;
        int r=2;
        temp=(int)(temp%2000);
        System.out.println(temp);
        if(year>2000 && year<3000)
        {
            year=year-1;
            year=(int)(year%2000);
            a=(int)(year/4);
            if(year%4==0)
            {
                r=0;
            }
            year=year-a;
            a=a*r;
            a=year+a;
            System.out.println(a);
            System.out.println(month);
            month=month-1;
            switch(month)
            {
                case 1:
                    a+=3;
                case 2:
                    if(r==0 || temp%4==0)
                        a+=1;
                case 3:
                    a+=3;
                case 4:
                    a+=2;
                case 5:
                    a+=3;
                case 6:
                    a+=2;
                case 7:
                    a+=3;
                case 8:
                    a+=3;
                case 9:
                    a+=2;
                case 10:
                    a+=3;
                case 11:
                    a+=2;
                case 12:
                    a+=3;

            }
            System.out.println(a);
            sum=day+a;
            System.out.println(sum);
            sum=sum%7;
           switch(sum)
           {
                case 0:
                    s="SUNDAY";
                    break;
                case 1:
                    s="MONDAY";
                    break;     
                case 2:
                    s="TUESDAY";
                    break;
                case 3:
                    s="WEDNESDAY";
                    break;
                case 4:
                    s="THURSDAY";
                    break;
                case 5:
                    s="FRIDAY";
                    break;
                case 6:
                    s="SATURDAY";
                    break;
           }
        }
        return s;
    }
}