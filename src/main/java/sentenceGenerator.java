import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sentenceGenerator {
    private List<String> firstWordList;
    private List<String> secondWordList;
    private List<String> thirdWordList;
    private List<String> lastPartString;
    private Random random;

    public sentenceGenerator(){
        this.firstWordList= new ArrayList<String>();
        this.secondWordList=new ArrayList<String>();
        this.thirdWordList=new ArrayList<String>();
        this.lastPartString=new ArrayList<String>();
        this.random=new Random();
    }

    public void addFirstWordList(String firstWord){
        this.firstWordList.add(firstWord);
    }
    public void addSecondWordList(String secondWord){
        this.secondWordList.add(secondWord);
    }
    public void addThirdWordList(String thirdWord){
        this.secondWordList.add(thirdWord);
    }
    public void addLastPartOfStringList(String lastPartString){
        this.lastPartString.add(lastPartString);
    }

    public void generateRandomSentence(){
        if (firstWordList.isEmpty() || secondWordList.isEmpty() || thirdWordList.isEmpty()
            || lastPartString.isEmpty()){
            System.out.println("first you need to fill the lists with words from which will be chosen a random sentence ");
        }
        String firstWord= firstWordList.get(random.nextInt(firstWordList.size()));
        String secondWord= secondWordList.get(random.nextInt(secondWordList.size()));
        String thirdWord= thirdWordList.get(random.nextInt(thirdWordList.size()));
        String lastPart= lastPartString.get(random.nextInt(lastPartString.size()));

        String generatedSentence=firstWord+" "+secondWord+" "+thirdWord+" "+lastPart+".";

    }
}
