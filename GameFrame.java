import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements ActionListener {
    public JFrame game;

    //on screen text
    JLabel dText;

    //buttons for choices
    JButton continueButton;
    JButton nextButton;
    JButton lockDoor;
    JButton leaveDoor;

    //backstory variables are for the story
    private int backstoryNumber;
    private String backstory1;
    private String backstory2;
    private String backstory3;
    private String backstory4;
    private String backstory5;
    private String backstory6;
    private String backstory7;
    private String backstory8;
    private String backstory9;
    private String backstory10;
    private String backstory11;
    private String backstory12;
    private String backstory13;

    //for the first choice
    private String choice1;
    private int mikeYes;
    private String choice1A;
    private String choice1B;

    private String backstory14;
    private String backstory15;
    private String backstory16;
    private String backstory17;
    private String backstory18;

    //for the second choice
    private String choice2;
    private int lockDoorYes;
    private String choice2A;
    private String choice2B;

    private String backstory19;
    private String backstory20;
    private String backstory21;
    private String backstory22;
    private String backstory23;
    private String backstory24;
    private String backstory25;
    private String backstory26;
    private String backstory27;
    private String backstory28;
    private String backstory29;
    private String backstory30;
    private String backstory31;
    private String backstory32;
    private String backstory33;
    private String backstory34;
    private String backstory35;
    private String backstory36;
    
    //for the third choice
    private String choice3;
    private int lockDoor2;
    private String choice3A;
    private String choice3B;

    private String backstory37;
    private String backstory38;
    private String backstory39;
    private String backstory40;
    private String backstory41;
    private String backstory42;
    private String backstory43;
    private String backstory44;
    private String backstory45;
    private String backstory46;
    private String backstory47;
    private String backstory48;
    private String backstory49;
    private String backstory50;
    private String backstory51;
    private String backstory52;
    private String backstory53;
    private String backstory54;
    private String backstory55;
    private String backstory56;
    private String backstory57;
    private String backstory58;
    private String backstory59;
    private String backstory60;
    private String backstory61;
    private String backstory62;
    private String backstory63;
    private String backstory64;
    private String backstory65;
    private String backstory66;
    private String backstory67;
    private String backstory68;
    private String backstory69;
    private String backstory70;
    

    

    
    public GameFrame() {
       
        // dialog/story
        backstory1 = "STORY: You are a late night security guard at 'Scream Park'";
        backstory2 = "The park is closed for the night and you have the job of patrolling the grounds.";
        backstory3 = "There are cameras all over the park that you watch to help you moniter the park.";
        backstory4 = "You are sitting in your security booth, simply minding your buisiness waiting for your shift to end.";
        backstory5 = "Flipping mindlessly through tv channels, hoping to find something interesting to watch,";
        backstory6 = "you reach for your bag of assorted snacks but realize you've reached the bottom of the bag.";
        backstory7 = "Staring at the empty snack bag, disheartened and slightly sad, the tv catches your attention.";
        backstory8 = "NEWS REPORTER: This just in, another sighting of an armed and dangerous man has been reported.";
        backstory9 = "This suspect has been spotted numerous times now and an official police statement has been released, saying:";
        backstory10 = "A man carying some sort of bladed object is stalking arund the local neighboorhood.";
        backstory11 = "He has a fairly large build and can be identified by his mask, one from the local 'Scream Park'";
        backstory12 = "We are unsure if he is an employee at the park or even related to it at all, however...";
        backstory13 = "We have some suspicion that he might have some relation to the dissapearence of the park's previous security guard Mike Smith.";
       
        choice1 = "STORY: Did you ever meet Mike?";
        choice1A = "YOU: It's a shame what happened to MIke, he was a really nice guy, good at his job too.";
        choice1B = "YOU: It's a shame what happened to that Mike guy, had a family and everything, was good at his job too aparently.";
       
        backstory14 = "NEWS REPORTER: It is uncomfirmed, but the connections are there.";
        backstory15 = "Police are asking residents to lock your doors and windows and stay inside at night while the investigation occurs.";
        backstory16 = "If you have any information on the suspect, please contact local law enforcement immediatly.";
        backstory17 = "This has been your nightly Channel 7 news update.";
        backstory18 = "YOU: Man, what has gone wrong with the world where this is becoming a fairly common thing.";
        
        choice2 = "STORY: Do you lock the security booth door?";
        choice2A = "After hearing that distressing news, you feel inclined to lock the booth's door, even though you're not that worried.";
        choice2B = "You begin flipping through the channels again in blissful ignorance, figuring the problem will sort itself out.";
       
        backstory19 = "You set the controller down after feeling content on finding a re-run of an old show you watched.";
        backstory20 = "A yawn emerges from you, 'Man, night shifts can be rough sometimes' you say slightly annoyed.";
        backstory21 = "You hear a noise coming from behind the booth.";
        backstory22 = "Starteled, you look behind you only to see nothing, when you hear something else, except this time from within the booth. drip";
        backstory23 = "You quickly turn back around to see nothing. drip";
        backstory24 = "Suddenly, everything goes quiet, every noise amplifies and deafens as you begin to subconsciously hyperfixate on the dripping sound. drip";
        backstory25 = "You see a droplet fall in front of you, as it stains your pants, you realize what it is, blood. drip";
        backstory26 = "Your gaze lifts up to the ceiling.";
        backstory27 = "A distorted, elongated face appears to morph around your cone of vision, you suddenly are paralyzed wth fear";
        backstory28 = "It openes its mouth to say something, but the sound is blocked out by the still deafening dripping.";
        backstory29 = "The face's eyes pan over to the area behind you, then look back, it looks as if it is going to say something";
        backstory30 = "Something then grips your shoulders and you feel a sudden and sharp pain in your back.";
        backstory31 = "You wake up in a jolt of energy, your heart racing a million miles an hour with sweat driping down your forehead.";
        backstory32 = "YOU: Damn, just a dream, why does this keep happening.";
        backstory33 = "STORY: Lately you have been having very realistic nightmares, you are unsure what's causing them however.";
        backstory34 = "You look up at your ceiling, worried the face would be there again but don't see anything and cautiously step outside.";
        backstory35 = "As you close the door behind you, you look up at the moon, wondering why you recognize the face you saw.";
        backstory36 = "You look at your watch, only to realize you have to do your nightly rounds.";
        
        choice3 = "You look back at the booth, not wanting to go back in, so you decide to walk your rounds instead. Lock the booth door? Button 1 for YES Button 2 for NO.";
        choice3A = "You decide to grab your keys and lock the door, perhaps remembering the police notice, or just not wanting to see the face again.";
        choice3B = "You decide to just leave it unlocked, your the only one there so there shouldn't be a problem, plus you don't want to see the face again.";
      
        backstory37 = "You begin to walk down a path, admiring the view of empty rides, there is something so surreal about it.";
        backstory38 = "Focusing on the peaceful environment helps you forget about what you saw, and masks feeling of being watched.";
        backstory39 = "You remember coming to this park when you were little.";
        backstory40 = "You always wanted to work at a place like this, it seemed like the best job in the world.";
       
        //shift in tone
        backstory41 = "It's a shame I won't let you                                   RUN";
        backstory42 = "";
        backstory43 = "Unfortuatly you got stuck as the security guard, on the night shift of all things.";
        backstory44 = "NOTNIGHTNOTNIGHTNOTNIGHTNOTNIGHTNOTNIGHTDARKDARKDARKFACERUNRUNRUNRUNRUNRUNRUN";
        
        //spelling mistakes like in this line here are on purpose, to indicate what is happening may not be what it seems
        backstory45 = "You sudenly feel an overbaring need to walk into the dark corner you see befor you.";
        backstory46 = "Snapping out of a daze you pick up your stride and walk as far away from that building.";
        backstory47 = "Turning around you realize the building was abandoned, an old funhouse that they were in the midst of tearing down.";
        backstory48 = "A cold shiver runs down your spine as you see a face, on the side of the wall, staring at you, the same face.";
        backstory49 = "Encompased with an overwhelming feeling of dread, you begin to hyperfixate on the face, unable to break eye contact.";
        backstory50 = "You swifttly turn arond and run back in the derection of the security booth.";
        backstory51 = "You make it there and fumbel with your keys for a moment before walking inside, slaming and locking the door behind you.";
        backstory52 = "Turning back around you begin to move forwards further into the building.";
        backstory53 = "Faces are on the walls";
        backstory54 = "Screaming";
        backstory55 = "RUN";
        backstory56 = "You begin to explore these unfamiliar surroundings, being careful not to make too much noise.";
        backstory57 = "YOUR CHOICES DON'T MATTER";
        backstory58 = "A glimmer suddenly catches your eye";
        backstory59 = "A large room with a mirror, you walk up to it.";
        backstory60 = "You are there, bloody and smiling.";
        backstory61 = "Your face begins to contort into the same smiling face you've seen all this time.";
        backstory62 = " D0 you want too see him?";
        backstory63 = "You slowly turn left to see the body of Mike Smith staring at you, with his face in a contorted smile.";
        backstory64 = "Uh oh";
        backstory65 = "Uh oh";
        backstory66 = "Uh oh";
        backstory67 = "Uh oh";
        backstory68 = "";
        backstory69 = "the end";

        this.setLayout(new FlowLayout());
        // frame
        this.setTitle("Scream Park");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 950);
        this.getContentPane().setBackground(new Color(0x000000));

        //icon
        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());

        // text
        dText = new JLabel();
        dText.setHorizontalAlignment(JLabel.LEFT);
        dText.setVerticalAlignment(JLabel.TOP);
        dText.setFont(new Font("MV Boli", Font.PLAIN, 15));
        dText.setForeground(new Color(136,8,8));
        this.add(dText);

        // main button
        continueButton = new JButton();
        continueButton.addActionListener(event -> this.actionPerformed(event));
        continueButton.setBounds(100, 100, 200, 150);
        continueButton.setText("Click To Continue!");
        continueButton.setFocusable(false);
        this.add(continueButton);

        this.setVisible(true);

         this.repaint();

         //added when choice is needed
        nextButton = new JButton();
        nextButton.addActionListener(event -> this.actionPerformed1(event));
        nextButton.setBounds(500, 500, 200, 200);
        nextButton.setText("");

        lockDoor = new JButton();
        lockDoor.addActionListener(event -> this.actionPerformed2(event));
        lockDoor.setBounds(500, 500, 200, 200);
        lockDoor.setText("");
        
        leaveDoor = new JButton();
        leaveDoor.addActionListener(event -> this.actionPerformed3(event));
        leaveDoor.setBounds(500, 500, 200, 200);
        leaveDoor.setText("");

    }

    @Override
    public void actionPerformed(ActionEvent event) {//need more of these for different buttons *ADD MORE*
        // TODO Auto-generated method stub
        backstoryNumber++;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'actionPerformed'");

        //story dialogue
        switch(backstoryNumber){
            case 1:
            dText.setText(backstory1);
            break;

            case 2:
            dText.setText(backstory2);
            break;

            case 3:
            dText.setText(backstory3);
            break;

            case 4:
            dText.setText(backstory4);
            break;

            case 5:
            dText.setText(backstory5);
            break;

            case 6:
            dText.setText(backstory6);
            break;

            case 7:
            dText.setText(backstory7);
            break;

            case 8:
            dText.setText(backstory8);
            break;

            case 9:
            dText.setText(backstory9);
            break;

            case 10:
            dText.setText(backstory10);
            break;
            
            case 11:
            dText.setText(backstory11);
            break;

            case 12:
            dText.setText(backstory12);
            break;

            case 13:
            dText.setText(backstory13);
            break;
            
            //choice 1
            case 14:
            dText.setText(choice1 + " Button 1 for YES, Button 2 for NO");
            this.add(nextButton);
            break;
            
            case 15:
            dText.setText(choice1A);
            nextButton.setVisible(false);
            break;

            case 16:
            dText.setText(backstory14);
            break;

            case 17:
            dText.setText(backstory15);
            break;

            case 18:
            dText.setText(backstory16);
            break;

            case 19:
            dText.setText(backstory17);
            break;

            case 20:
            dText.setText(backstory18);
            break;

            //choice 2
            case 21:
            dText.setText(choice2 + " Button 1 for YES Button 2 for NO");
            this.add(lockDoor);
            break;

            case 22:
            dText.setText(choice2A);
            lockDoor.setVisible(false);
            break;

            case 23:
            dText.setText(backstory19);
            break;

            case 24:
            dText.setText(backstory20);
            break;

            case 25:
            dText.setText(backstory21);
            break;

            case 26:
            dText.setText(backstory22);
            break;

            case 27:
            dText.setText(backstory23);
            break;

            case 28:
            dText.setText(backstory24);
            break;

            case 29:
            dText.setText(backstory25);
            break;

            case 30:
            dText.setText(backstory26);
            break;

            case 31:
            dText.setText(backstory27);
            break;

            case 32:
            dText.setText(backstory28);
            break;

            case 33:
            dText.setText(backstory29);
            break;

            case 34:
            dText.setText(backstory30);
            break;

            case 35:
            dText.setText(backstory31);
            break;

            case 36:
            dText.setText(backstory32);
            break;

            case 37:
            dText.setText(backstory33);
            break;

            case 38:
            dText.setText(backstory34);
            break;

            case 39:
            dText.setText(backstory35);
            break;

            case 40:
            dText.setText(backstory36);
            break;

            //choice 3
            case 41:
            dText.setText(choice3);
            this.add(leaveDoor);
            break;

            case 42:
            dText.setText(choice3A);
            leaveDoor.setVisible(false);
            break;

            case 43:
            dText.setText(backstory37);
            break;

            case 44:
            dText.setText(backstory38);
            break;

            case 45:
            dText.setText(backstory39);
            break;

            case 46:
            dText.setText(backstory40);
            break;

            case 47:
            dText.setText(backstory41);
            break;

            case 48:
            dText.setText(backstory42);
            break;

            case 49:
            dText.setText(backstory43);
            break;

            case 50:
            dText.setText(backstory44);
            break;

            case 51:
            dText.setText(backstory45);
            break;

            case 53:
            dText.setText(backstory46);
            break;

            case 54:
            dText.setText(backstory47);
            break;

            case 55:
            dText.setText(backstory48);
            break;

            case 56:
            dText.setText(backstory49);
            break;

            case 57:
            dText.setText(backstory50);
            break;

            case 58:
            dText.setText(backstory51);
            break;

            case 59:
            dText.setText(backstory52);
            break;

            case 60:
            dText.setText(backstory53);
            break;

            case 61:
            dText.setText(backstory54);
            break;

            case 62:
            dText.setText(backstory55);
            break;

            case 63:
            dText.setText(backstory56);
            break;

            case 64:
            dText.setText(backstory57);
            break;

            case 65:
            dText.setText(backstory58);
            break;

            case 66:
            dText.setText(backstory59);
            break;

            case 67:
            dText.setText(backstory60);
            break;

            case 68:
            dText.setText(backstory61);
            break;

            case 69:
            dText.setText(backstory62);
            break;

            case 70:
            dText.setText(backstory63);
            break;

            case 71:
            dText.setText(backstory64);
            break;

            case 72:
            dText.setText(backstory65);
            break;

            case 73:
            dText.setText(backstory66);
            break;

            case 74:
            dText.setText(backstory67);
            break;

            case 75:
            dText.setText(backstory68);
            break;

            case 76:
            dText.setText(backstory69);
            break;
        }

        // switch(gameNumber){
        //     case 11:
        //     dText.setText("Hi");
        //     nextButton.setVisible(false);
        //     break;
        // }

    }

    public void actionPerformed1(ActionEvent event){
        mikeYes++;
        switch(mikeYes){

            //refer to case 14 in backstory
            case 1:
            dText.setText(choice1B);
            nextButton.setVisible(false);
            break;

        }
        backstoryNumber++;
        
    }

    public void actionPerformed2(ActionEvent event){
        lockDoorYes++;
        switch(lockDoorYes){

            //refer to case22 in backstory
            case 1:
            dText.setText(choice2B);
            lockDoor.setVisible(false);
            break;
        }
        
        backstoryNumber++;
    }

    public void actionPerformed3(ActionEvent event){
        lockDoor2++;
        switch(lockDoor2){

            //refer to case 41 in backstory
            case 1:
            dText.setText(choice3B);
            leaveDoor.setVisible(false);
            break;

        }
        backstoryNumber++;
    }

}
