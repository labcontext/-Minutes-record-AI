import azure.cognitiveservices.speech as speechsdk
import datetime

speech_key, service_region = #Insert your speech_key, service_region
speech_config = speechsdk.SpeechConfig(subscription=speech_key, region=service_region)

speech_recognizer = speechsdk.SpeechRecognizer(speech_config=speech_config)

""" 
With using Azure speech to text API, our team is now making the Minute record AI.
This code is hear the sound and convert to the text.
The text will be saved in the record_1.txt file and you can change the name of it or change the path where you want save.
And the time will be saved with a text.

Next our work is using Azure speaker recognition API to classify the person who talk.
But speaker recognition's free key period is only 7 days. So we will found another method or something..

python filename.py and check this code.

* When you said "Exit." this code will stop.
"""

print("Start the recording")
f = open("record_1.txt", 'w')
while True:
    now = datetime.datetime.now()
    nowDatetime = now.strftime('%Y-%m-%d %H:%M:%S')
    result = speech_recognizer.recognize_once()


    if result.reason == speechsdk.ResultReason.RecognizedSpeech:
        print("Recognized: {}".format(result.text))
    elif result.reason == speechsdk.ResultReason.NoMatch:
        print("No speech could be recognized: {}".format(result.no_match_details))
    elif result.reason == speechsdk.ResultReason.Canceled:
        cancellation_details = result.cancellation_details
        print("Speech Recognition canceled: {}".format(cancellation_details.reason))
        if cancellation_details.reason == speechsdk.CancellationReason.Error:
            print("Error details: {}".format(cancellation_details.error_details))
    f.write("[%s] - %s\n"%(nowDatetime, result.text))
    
    if result.text == 'Exit.':
        break
    
    
f.close()
    