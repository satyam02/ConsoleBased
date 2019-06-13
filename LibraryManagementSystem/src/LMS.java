
import java.util.*;
class Book
{Scanner s=new Scanner(System.in);
static int t;
static String bk;
LibraryMgmtSystem n;
    Book() {
        this.n = new LMS();
    }

    void ABook(String b[],int d[],String m[],String p[])
    {  System.out.println("Enter the number of books you want to issue");
    t=s.nextInt();
    for(int j=0;j<100;j++)
    {if(p[j]==null)
    {
    for(int i=j;i<(t+j);i++)
    { System.out.println("Enter book name");
       b[i]=s.next();
        System.out.println("Enter the person Name");
        p[i]=s.next();
    System.out.println("Enter Date");
        d[i]=s.nextInt();
        System.out.println("Enter month");
        m[i]=s.next();
        
        }
    }   
    } n.lms();
    }
    void DBook(String b[],int d[],String m[],String p[])
    {System.out.println("Enter the Book Name");
    bk=s.next();
    for(int i=0;i<b.length;i++)
    {
       if(bk.equals(b[i]))
       {for(int j=i;j<b.length;j++) {
           b[j]=b[j+1];
           d[j]=d[j+1];
           m[j]=m[j+1];
           p[j]=p[j+1];
       }
    }
     n.lms();
    }
    }
    void show(String b[],int d[],String m[],String p[])
    {for(int i=0;i<b.length;i++)
    {if(null!=p[i])
    {   System.out.println(b[i]);
        System.out.println(p[i]);
        System.out.println(d[i]);
        System.out.println(m[i]);
    }
        
    }
      n.lms();  
    }
}

class librarianData
{Scanner sc=new Scanner(System.in);
 String name;
 static int temp;
LibraryMgmtSystem m;
    librarianData() {
        this.m = new LMS();
    }
    void AddLibrarian(String libname[])
{System.out.println("Enter the number of libraian you want");
     temp=sc.nextInt();
     for(int j=0;j<libname.length;j++)
     {if(libname[j]==null)
     {   
     for(int i=j;i<(j+temp+1);i++)
      {  libname[i]=sc.nextLine(); 
      }
     break;
     }
     }
      m.lms( ); 
    }
void DltLibrarian(String libname[])
{ System.out.println("Enter the Name to Dlt librarian");
    name=sc.next();
    for(int i=0;i<libname.length;i++)
    {if (name.equals(libname[i]))
    {libname[i]=libname[i+1];
    }   
    }
             m.lms(); 
}
void show(String libname[])
{   for (String libname1 : libname) {
        if (null != libname1) {
            System.out.println(libname1);
        } 
    }
     m.lms();       
    
}
}
class AdLb 
{    Scanner obj=new Scanner(System.in);
    static String libName[]=new String[100];
    static String []book=new String[100];
    static String []person=new String[100];
    static String []month=new String[100];
    static int Date[]=new int[100];
    void admin()
    { int pass=0,p,l;
     System.out.println("welcome");
     System.out.println("Enter your password");
     p=obj.nextInt();
     if(pass==p)
     {
        System.out.println("Enter 1.Add Librarian 2.Delete Librarian 3.Show");
        l=obj.nextInt();
        switch(l)
        {
            case 1:
                librarianData al=new  librarianData();
                al.AddLibrarian(libName);
                break;
            case 2:
                librarianData dl=new  librarianData();
                dl.DltLibrarian(libName);
                break;
            case 3:
                librarianData sl=new  librarianData();
                sl.show(libName);
                break;
            default:
              System.out.println("Enter a valid choice"); 
              break;
        }
     } 
     else
     {
         System.out.println("Enter the correct password");
     }
    }
    void librarian()
    {  
        int b;
       System.out.println("welcome");
       System.out.println("Enter your choice 1.Issue book 2.Return book 3.Show");
       b=obj.nextInt();
       switch(b)
       {
           case 1:
               Book ab=new Book();
               ab.ABook(book,Date,month,person);
               break;
           case 2:
              Book db=new Book();
               db.DBook(book,Date,month,person);       
               break;
           case 3:
               Book sh=new Book();
               sh.show(book,Date,month,person);
               break;
           default:
               System.out.println("Enter a valid choice");
               break;
       }
  }
        
    }

 class LibraryMgmtSystem extends AdLb
{
    public void lms()
    {
        int e;
        System.out.println("Enter 1.Admin 2.Librarian");
       Scanner in=new Scanner(System.in);
        e=in.nextInt();
        switch(e)
        {     
            case 1:
        {
          AdLb a=new AdLb();
          a.admin();
          break;
        }
            case 2:
        {
         AdLb l=new AdLb();
                 l.librarian();
                  break;
       }
            default :
        {System.out.println("Enter Valid Choice");
             lms();
    }
        }
    }

    
}
public class LMS {
    public static void main(String[] args) {
        LibraryMgmtSystem l=new LibraryMgmtSystem();
        l.lms();
    }
    
}
