package Helpers;

public class Alignment {
    public Ethic getEthic() {
        return ethic;
    }

    public Moral getMoral() {
        return moral;
    }

    public enum Moral {GOOD, NEUTRAL, EVIL};
    public enum Ethic {LAWFUL, NEUTRAL, CHAOTIC};
    private Ethic ethic;
    private Moral moral;

    public enum CombinedAlignment {
        Lawful_Good,
        Lawful_Neutral,
        Lawful_Evil,
        Neutral_Good,
        True_Neutral,
        Neutral_Evil,
        Chaotic_Good,
        Chaotic_Neutral,
        Chaotic_Evil;

    }

    public Alignment(CombinedAlignment combinedAlignment){
        switch(combinedAlignment){
            case Lawful_Good ->{ethic = Ethic.LAWFUL; moral = Moral.GOOD;}
            case Lawful_Neutral ->{ethic = Ethic.LAWFUL; moral = Moral.NEUTRAL;}
            case Lawful_Evil ->{ethic = Ethic.LAWFUL; moral = Moral.EVIL;}
            case Neutral_Good ->{ethic = Ethic.NEUTRAL; moral = Moral.GOOD;}
            case True_Neutral ->{ethic = Ethic.NEUTRAL; moral = Moral.NEUTRAL;}
            case Neutral_Evil ->{ethic = Ethic.NEUTRAL; moral = Moral.EVIL;}
            case Chaotic_Good ->{ethic = Ethic.CHAOTIC; moral = Moral.GOOD;}
            case Chaotic_Neutral ->{ethic = Ethic.CHAOTIC; moral = Moral.NEUTRAL;}
            case Chaotic_Evil ->{ethic = Ethic.CHAOTIC; moral = Moral.EVIL;}



        }

    }


}
