public class Demo{
	public static void main(String [] args){
		int i = 0;
		int j = 0;
        String str = "";
        int a[] = new int [5];
		
		// System.out.println(i/j); //Throws DivisionByZero Error
		try{ //To handle crircal statements
			j = i/j;
            int len = str.length();
            System.out.println(len);
            System.out.println(a[5]);


		}
		catch(ArithmeticException e){
			System.out.println("something went wrong: " + e);
		}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        //Parent class exception at end
        catch(Exception e){
            System.out.println(e);
        }
        
		
		System.out.println(i);
		System.out.println("Bye");
		
	}
}