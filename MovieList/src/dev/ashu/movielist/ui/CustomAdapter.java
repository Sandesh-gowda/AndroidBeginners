package dev.ashu.movielist.ui;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import dev.ashu.movielist.R;
import dev.ashu.movielist.model.movie;
import dev.ashu.movielist.model.movieResponse;
import dev.ashu.movielist.model.moviesReciever;

public class CustomAdapter extends BaseAdapter {
	
	private Context mContext;
	private LayoutInflater inflater;
	private List<movieResponse> MmovieItems;
	
	public CustomAdapter(Context Contextactivity, List<movieResponse> list) {
		MmovieItems = list;
		mContext = Contextactivity;
        
    }

	@Override
	public int getCount() {
		
		return MmovieItems.size();
	}

	@Override
	public movieResponse getItem(int position) {
		
		return MmovieItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_item, parent, false);
		movieResponse movieItem = getItem(position);
		ImageView movie_pic = (ImageView) rowView.findViewById(R.id.thumbnail);
		TextView title = (TextView) rowView.findViewById(R.id.title);
		TextView rating = (TextView) rowView.findViewById(R.id.rating);
		TextView genre = (TextView) rowView.findViewById(R.id.genre);
		title.setText(((moviesReciever) movieItem.getMovieReicever()).getMovies().getTitle());
		rating.setText("Rating: " + String.valueOf(movieItem.getMovieReicever().get(position).getMovies().getRating()));
		String genreStr = "";
        for (String str : movieItem.getMovieReicever().get(position).getMovies().getGenre()) {
            genreStr += str + ", ";
        }
        genreStr = genreStr.length() > 0 ? genreStr.substring(0,
                genreStr.length() - 2) : genreStr;
        genre.setText(genreStr);
        
		String imageUrl = movieItem.getMovieReicever().get(position).getMovies().getThumbnailUrl().toString();
		
		return convertView;
	}

}
