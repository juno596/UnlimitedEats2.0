package Eats.Unlimited;

public class Account {

    private String username;
    private String password;
    private String phone;

    public Account(String username, String phone) {
        if(username.isEmpty()){
            throw new IllegalArgumentException("Enter a username!");
        }if (username.length() < 5){
            throw new IllegalArgumentException("Enter a longer username!");
        }if (phone.isEmpty()){
            throw new IllegalArgumentException("Enter a phone number!");
        }if(phone.length() > 10){
            throw new IllegalArgumentException("Enter a longer phone number!");
        }//TODO: defensive check to make sure its only numbers


        this.username = username;
        this.password = genRandPass();
        this.phone = phone;
    }
    public Account(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }
    /**
     * generates a random password with upper and lower case letters
     * special chars and numbers
     * @return String random password
     */
    public String genRandPass(){
        String specialChars = "!@#$%^&*():;'[]{}}";
        StringBuilder p = new StringBuilder();
        int rand;

        p.append(getRandomLetter());
        p.append(getRandomLetter());
        //Create random password with int a letters/numbers total
        for(int i = 0; i < 10; i++){
            //randomly select 1 or 2 to choose if next letter should be num or letter
            int oneOrTwo = (int)(Math.random()*3) + 1;

            if(oneOrTwo == 1){
                p.append(getRandomNum());
            } else if(oneOrTwo == 2){
                p.append(getRandomLetter());
            } else {
                rand = (int)(Math.random()*17);
                p.append(specialChars.substring(rand, rand + 1));
            }
        }
        rand = (int)(Math.random()*13);
        p.append(specialChars.substring(rand, rand + 1));
        return p.toString();
    }
    public String getRandomNum(){
        String numbers = "12345678900";
        //create random numbers to be added
        int randNum = (int)(Math.random()*10);
        //return random int to password
        return numbers.substring(randNum, randNum + 1);
    }
    public String getRandomLetter(){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzz";
        //create random numbers to be added
        int randLetter = (int)(Math.random()*52);
        //return a random letter
        return letters.substring(randLetter, randLetter + 1);
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
