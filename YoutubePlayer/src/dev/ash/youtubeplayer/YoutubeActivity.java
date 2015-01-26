package dev.ash.youtubeplayer;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

	public static final String GOOGLE_API_KEY = "AIzaSyAW_icQTkRB0ZQLAlZrclhfYJ4MQsnY6QQ";
	public static final String YOUTUBE_VIDEO_ID = "cO7e0HOlgKQ";
	
	@Override
	protected void onCreate(Bundle savedinstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedinstanceState);
		setContentView(R.layout.youtube);
		YouTubePlayerView YTPview = (YouTubePlayerView) findViewById(R.id.youtube_player);
		YTPview.initialize(GOOGLE_API_KEY, this);
	}
	
	public void onInitializationFailure(Provider provider, YouTubeInitializationResult result){
		Toast.makeText(YoutubeActivity.this, "Cannot play video", Toast.LENGTH_LONG).show();
	}
	
	public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored){
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);
		if(!wasRestored){
			player.cueVideo(YOUTUBE_VIDEO_ID);
		}
	}
	
	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
		
		@Override
		public void onStopped() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onSeekTo(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onPlaying() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onPaused() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onBuffering(boolean arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	
	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
		
		@Override
		public void onVideoStarted() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onVideoEnded() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onLoading() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onLoaded(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onError(ErrorReason arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onAdStarted() {
			// TODO Auto-generated method stub
			
		}
	};
	
}