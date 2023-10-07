import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int timeWorked;
    private int occurance;

        //base
        public Person() {
            occurance = 0;
        }
    
    /// getWord () ///
    /// Input : n/a ///
    /// Output: returns the specific word found in the node ///
        public String getName() {
            return name;
        }
    
    /// setWord (String word) ///
    /// Input : The word you want to insert into linked list ///
    /// Output: sets the word ///
        public void setName(String word) {
            this.name = word;
        }

        public Integer getTimeWorked() {
            return timeWorked;
        }
    
    /// setWord (String word) ///
    /// Input : The word you want to insert into linked list ///
    /// Output: sets the word ///
        public void setTimeWorked(Integer time) {
            this.timeWorked = time;
        }
    
    /// getOccurance () ///
    /// Input : n/a ///
    /// Output: returns the number of times the word has been seen ///
        public Integer getOccurance() {
            return occurance;
        }
    
    /// updateOccurance () ///
    /// Input : n/a ///
    /// Output: increments the occurance count by 1 ///
        public void updateOccurance() {
            occurance++;
        } 
        

}