public class Main {
    public static void main(String[] args) {
        SentenceGenerator sentenceGenerator= new SentenceGenerator();

        sentenceGenerator.addFirstWordList("Hello");
        sentenceGenerator.addFirstWordList("I");
        sentenceGenerator.addFirstWordList("You");
        sentenceGenerator.addFirstWordList("What?");

        sentenceGenerator.addSecondWordList("Love");
        sentenceGenerator.addSecondWordList("Hate");
        sentenceGenerator.addSecondWordList("Forever");
        sentenceGenerator.addSecondWordList("Stupid");

        sentenceGenerator.addThirdWordList("Bitch");
        sentenceGenerator.addThirdWordList("Whatssup");
        sentenceGenerator.addThirdWordList("let's");
        sentenceGenerator.addThirdWordList("would you");

        sentenceGenerator.addLastPartOfStringList("Drink some wine with me?");
        sentenceGenerator.addLastPartOfStringList("shut up");
        sentenceGenerator.addLastPartOfStringList("see your mom?");
        sentenceGenerator.addLastPartOfStringList("dance for me");

        sentenceGenerator.generateRandomSentence();
        sentenceGenerator.generateRandomSentence();

    }
}
