package com.e.quotesensation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    private String Quotes[] = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
            "The way to get started is to quit talking and begin doing. -Walt Disney",
            "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs",
            "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt",
            "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey",
            "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron",
            "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa",
            "When you reach the end of your rope, tie a knot in it and hang on. -Franklin D. Roosevelt",
            "Always remember that you are absolutely unique. Just like everyone else. -Margaret Mead",
            "Don't judge each day by the harvest you reap but by the seeds that you plant. -Robert Louis Stevenson",
            "The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt",
            "Tell me and I forget. Teach me and I remember. Involve me and I learn. -Benjamin Franklin",
            "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller",
            "It is during our darkest moments that we must focus to see the light. -Aristotle",
            "Whoever is happy will make others happy too. -Anne Frank",
            "Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson",
            "Sometimes when i close my eyes, I cant see. -Kabiru",
            "You will face many defeats in life, but never let yourself be defeated. -Maya Angelou",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
            "In the end, it's not the years in your life that count. It's the life in your years. -Abraham Lincoln",
            "Never let the fear of striking out keep you from playing the game. -Babe Ruth",
            "Life is either a daring adventure or nothing at all. -Helen Keller",
            "Many of life's failures are people who did not realize how close they were to success when they gave up. -Thomas A. Edison",
            "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. -Dr. Seuss",
            "If life were predictable it would cease to be life and be without flavor. -Eleanor Roosevelt",
            "In the end, it's not the years in your life that count. It's the life in your years. -Abraham Lincoln",
            "Life is a succession of lessons which must be lived to be understood. -Ralph Waldo Emerson",
            "You will face many defeats in life, but never let yourself be defeated. -Maya Angelou",
    };

    public ViewPagerAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Quotes.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View v = layoutInflater.inflate(R.layout.viewpagerlayout, container,false);


        TextView textView = v.findViewById(R.id.tvQuote);

        textView.setText(Quotes[position]);

        container.addView(v);


        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}
