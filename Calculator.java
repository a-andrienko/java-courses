/**
 Simple Calculator
 */
public class Calculator{
    /**
     *   @param result of calculation
     */
    private int result;

    /**
     * Sum the arguments
     * @param params Arguments of sum
     */
    public void add(int ... params){
        for (int param : params){
            this.result += param;
        }
    }

    /**
     * Get the result of summing
     * @return the result
     */
    public int getResult(){
        return this.result;
    }

    /**
     * Clean result of calculation
     */
    public void cleanResult(){
        this.result = 0;
    }

}