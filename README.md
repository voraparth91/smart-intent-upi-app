# smart-intent-upi-app


Today, I see most of the UPI Apps in market shows up in the Intent Resolver when another App tries to take a payment through UPI App. For an instance, If I am trying to make a payment in CRED App with UPI Apps, it shows me a list of Apps like BHIM, Google Pay, PhonePe, etc.. (all the apps that are installed and listening on upi intent). Now, lets assume case where I am not registered (no device binding or linked account yet) in Google Pay. Now when I try to make a payment and select Google
Pay, it takes me through whole process of device binding, linking account and then letting me pay. I believe, in this scenario, bect option was to just avoid Google Pay as an option to user. 

This App shows how a PSP App can stop itself from popping up if User is not yet registered in their App.
