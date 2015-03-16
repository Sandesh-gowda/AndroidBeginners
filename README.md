# <h1>AndroidBeginners
This Repository Includes Basic to intermediate and intermediate level to expert level android approaches.

**Android Beginners**  
These programs are very much diverse approach from basic to advance android learners.  
This repository Includes working on   
WebView.  
ListView with different approaches.  
GridView with different approaches.  

**Working with list and gridviews **
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Gridview.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Listview.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/programatic%20Grid%20view.png)


**APPLES TOP APPLICATIONS RSSFeed XMLparser**  
Using XML Pull parser and a native android network requests this application can able to retrieve the apple's top applications rss feed and by replacing with other Rssfeed which matches xml tags of application in apple's store this client code can parse the apples feeds link : ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml   
**Happy Coding**

**Working with XML parsing (APPLE RSS XML FEED)**
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Apple top Apps Rss Reader.png)

**YOUTUBE API working with playlists**  
Youtube has became a perfect media for people to learn and communicate and the way your application integrates videos from youtube api should be simpler and Playlists should be an essential part of your channel strategy. Not only do they increase watch-time, they create another asset that will appear in search results for your benifit. I have taken my time to write this cool playlist parsing android program in couple of lines so anybody can understand what code is conveying here.
**HAPPY YOUTUBING YOURSELF**  

**Working with Youtube Api playlist**  
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Youtubeplaylist%20/playlistIndex%202%20.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Youtubeplaylist%20/playlist%20with%20button.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Youtubeplaylist%20/playlist.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/Youtubeplaylist%20/Single%20Video.png)

**Fragments using XML**  
Fragments are the best way to work with large devices and applications that has minimal UI frame that does some dynamic acticvity. Framents are totally similar to activities and fragments has its own lifecycle and fragment can be dynamic using java as well for approaching the dynamic application logics fragments plays a major role it is introduced in later honeycomb 3.0 android versions but can be programmed to prior verison of android devices reaching the version 1.6 . Learning working with fragments is a coolest of coolest thing to developer.  
**HAPPY CODING** 

**working with fragments**
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/working%20with%20fragments/XML%20fragment.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/working%20with%20fragments/XML%20fragments.png)


 **MediaRecorder Class for audio recording**  
  Android has a built in microphone through which you can capture audio and store it , or play it in your phone. There are many   ways to do that but the most common way is through MediaRecorder class. Android provides MediaRecorder class to record audio    or video. In order to use MediaRecorder class ,you will first create an instance of MediaRecorder class. Its syntax is given    below.  
  **Syntax:** MediaRecorder myAudioRecorder = new MediaRecorder();    myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);   myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);   myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB); 
  myAudioRecorder.setOutputFile(outputFile);
  
  **Working with MediaRecorder class for audio recording.**  
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Audio/screens/screen1.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Audio/screens/Screen2.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Audio/screens/screen3%20.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Audio/screens/screen4.png)


   **Understanding Bluetooth and its functionalities**  
   Among many ways, Bluetooth is a way to send or recieve data between two different devices. Android platform includes support for the Bluetooth framework that allows a device to wirelessly exchange data with other Bluetooth devices.  
   Android provides Bluetooth API to perform these different operations.

    Scan for other Bluetooth devices

    Get a list of paired devices

    Connect to other devices through service discovery

Android provides BluetoothAdapter class to communicate with Bluetooth. Create an object of this calling by calling the static method getDefaultAdapter(). Its syntax is given below.  
**Syntax:**    private BluetoothAdapter BA;
BA = BluetoothAdapter.getDefaultAdapter();

In order to enable the Bluetooth of your device, call the intent with the following Bluetooth constant ACTION_REQUEST_ENABLE. Its syntax is.

Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
startActivityForResult(turnOn, 0);  
  This example provides demonstration of BluetoothAdapter class to manipulate Bluetooth and show list of paired devices by the Bluetooth.

To experiment with this example , you need to run this on an actual device.

**Understanding Bluetooth and its features **  
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Bluetooth/screens/screenb1.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Bluetooth/screens/screenb2.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Bluetooth/screens/screenb3.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Bluetooth/screens/screenb4.png)


**WORKING WITH WEBVIEW**  
A View that displays web pages. This class is the basis upon which you can roll your own web browser or simply display some online content within your Activity. It uses the WebKit rendering engine to display web pages and includes methods to navigate forward and backward through a history, zoom in and out, perform text searches and more.

Note that, in order for your Activity to access the Internet and load web pages in a WebView, you must add the INTERNET permissions to your Android Manifest file:

<uses-permission android:name="android.permission.INTERNET" />  

**Working with webview**
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/webview.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/Screens/1webview.png)

**Finding your location based on gps co-ordinates using geo-coder class**  
This simple program with the repository name android location has the ability to show you the current device location name.

**Simple Steps to work with**  
1.Add the proper permissions in manifest  
2.Import google play service lib from extra's in your sdk  
3.Write the method findlocation() as demonstrated in the repository and implement LocationListener to the class.  
4.Use auto implemented stubs method called onlocationchanged() to call the toast or printing the co-ordinates in textview etc.
5.call the method findlocation() in your oncreate()   
5.TADA your program is ready to show your devices current location    

Simple and efficient to have fun arround  

**To find the device location**  
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/AndroidLocation/screens/screen%201.png)
![Screen](https://github.com/ashokslsk/AndroidBeginners/blob/master/AndroidLocation/screens/screen%202.png)


  
  **Upcoming programs**  
  Working with camera.  
  working with sensors.  
  working with networks.  
  requesting network API call and parsing Json data.
  and much more interesting topics.  
  
 




