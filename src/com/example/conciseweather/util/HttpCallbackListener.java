package com.example.conciseweather.util;

public interface HttpCallbackListener {
	void onFinish(String response);
	
	void onError(Exception e);
}
