package a13solutions.howtol2b;

import android.content.res.Resources;

/**
 * Created by 13120dde on 2017-09-10.
 */

class Controller {

    private Instruction[] instructions = new Instruction[3];
    private int[] images= new int[3];
    private int index = 0;
    private InfoFragment infoFragment;
    private ButtonFragment btnFragment;


    public Controller(InfoFragment infoFragment, ButtonFragment btnFragment) {
        this.infoFragment=infoFragment;
        this.btnFragment=btnFragment;
        this.btnFragment.setController(this);
        initiateResources();
    }

    private void initiateResources() {
        Resources res= infoFragment.getResources();
        images[0]=R.drawable.confessionbear;
        images[1]=R.drawable.panda;
        images[2]=R.drawable.panda2;
        instructions[0]=new Instruction(res.getString(R.string.what_to_do), res.getString(R.string.content));
        instructions[1]=new Instruction(res.getString(R.string.what_to_do2), res.getString(R.string.content2));
        instructions[2]=new Instruction(res.getString(R.string.what_to_do3), res.getString(R.string.content3));
    }

    public void previousClick() {
        index--;
        if(index<0){
            index = instructions.length-1;
        }
        infoFragment.setWhatToDo(instructions[index].getWhatToDo());
        infoFragment.setContent(instructions[index].getContent());
        infoFragment.setImage(images[index]);
    }

    public void nextClick() {
        index++;
        if(index>=instructions.length){
            index = 0;
        }

        infoFragment.setWhatToDo(instructions[index].getWhatToDo());
        infoFragment.setContent(instructions[index].getContent());
        infoFragment.setImage(images[index]);
    }

}
