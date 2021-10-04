package com.example.lab4.ViewPager;

import android.provider.ContactsContract;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lab4.R;

public class CustomViewPagerAdapter extends FragmentStateAdapter
{
    int[] images;


    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 0: return StudyTricksFragment.newInstance("Study Tip 1:","Always emphasize practice, concepts in math are like riding a bike.  Sure you will hit the pavement more times than not starting,  but eventually you will be a pro!",R.drawable.collegemath);
            case 1: return StudyTricksFragment.newInstance("Study Tip 2:","Take time to give yourself a break,  no reason in being overwealmed when a problem isn't working out.  Do something else, cut the grass, go for a walk, talk to a friend.  Let the concepts sit there,  you will have a better approach after a break.",R.drawable.derivativecalculus);
            case 2: return StudyTricksFragment.newInstance("Study Tip 3:","Get sleep,  resting is very good for the brain.  This does expand on concept #2, but you would be surpised the type of calculations your brain will undergo in a state of rest.  Usually revisiting a frustrating concept after a good night of rest always is easier, especially if you have been frustrated the night before.",R.drawable.differentialequations);
            case 3: return StudyTricksFragment.newInstance("Study Tip 4:","Always write problems out,  a good practice psychologically is write out a difficult problem 7 times.  It is an odd number, but it is lucky for that reason.  7 times of repetition, you will remember that concept forever. ",R.drawable.linearalgebra);
            case 4: return StudyTricksFragment.newInstance("Study Tip 5:","Listen to good music while you work,  this helps me a ton.  Doesn't have to be Mozart, you do not have to be that preppy.  I usually listen to a lot of hip-hop while I work, songs that get me pumped. Makes something that may be repetitive a little more bearable when you a frustrated.",R.drawable.integralcalculus);
            default:return StudyTricksFragment.newInstance("error","404!",R.drawable.vectorcalculus);
        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
