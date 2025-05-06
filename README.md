# java-extractOTPFromGmail
Getting Unread messages with the expected mail subject , reading the content and extracting it.
For Password, ive followed the below process.
🔐 Step 1: Enable 2-Step Verification
Go to: https://myaccount.google.com/security
Under "Signing in to Google", enable 2-Step Verification.

🔐 Step 2: Generate an App Password
Visit: https://myaccount.google.com/apppasswords
Select:
App: Mail
Device: Other (Custom name) → e.g., "JavaMailApp"
Click Generate
Copy the 16-character app password Google gives you

✏️ Step 3: Update Your Code
Replace With:
prop.setProperty("gmail_password", "your_app_password_here");
