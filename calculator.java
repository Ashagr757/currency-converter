Skip to content
DEV Community
Find related posts...
Powered by  Algolia
Log in
Create account

7
Jump to Comments

10
Save

Boost

Cover image for Creating a Calculator using Java AWT
ROHIT KUMAR
ROHIT KUMAR
Posted on Jun 18, 2021 • Edited on Jun 29, 2021


233

4
Creating a Calculator using Java AWT
#
java
#
programming
#
tutorial
#
guiapplication
OUTPUT

In this Java tutorial,
We will learn how to build a simple calculator using Java AWT. This calculator has some simple functionality like all the basic mathematical operations and some special addon features , we will see as we follow
So let’s get started
FIRST of all small description on AWT
AWT(Abstract Window Toolkit) is an API that helps in building GUI (Graphical User Interface) based java applications. GUI helps in user interactions using some graphics. It primarily consists of a set of classes and methods that are required for creating and managing the GUI in a simplified manner such as buttons,windows,frame,textfield,RadioButton etc
I have provided the Java code for the calculator which uses Action listener interface for EventHandling.
And yes its not an applet code, which is deprecated



import java.awt.*;  
import java.awt.event.*;  
class MyCalc extends WindowAdapter implements ActionListener{ 
  Frame f; 
Label l1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
double xd;
double num1,num2,check;

MyCalc(){  
  f= new Frame("MY CALCULATOR");
// INSTANTIATING COMPONENETS 
l1=new Label(); 
l1.setBackground(Color.LIGHT_GRAY);
l1.setBounds(50,50,260,60);


b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
b6=new Button("6");
  b6.setBounds(190,270,50,50);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
b0=new Button("0");
  b0.setBounds(120,410,50,50);
bneg=new Button("+/-");
  bneg.setBounds(50,410,50,50);
bpts=new Button(".");
  bpts.setBounds(190,410,50,50);
bback=new Button("back");
 bback.setBounds(120,130,50,50);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
bsub=new Button("-");
  bsub.setBounds(260,270,50,50);
bmult=new Button("*");
  bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
  bdiv.setBounds(260,130,50,50);
bmod=new Button("%");
  bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
  bcalc.setBounds(245,410,65,50);
bclr=new Button("CE"); 
  bclr.setBounds(50,130,65,50);


b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);

bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this); 

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 

f.addWindowListener(this);
//ADDING TO FRAME   
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);

f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback);

f.setSize(360,500);  
f.setLayout(null);  
f.setVisible(true);  
} 
                     //FOR CLOSING THE WINDOW
public void windowClosing(WindowEvent e) {
  f.dispose();
}

public void actionPerformed(ActionEvent e){ 
  String z,zt;
                        //NUMBER BUTTON 
if(e.getSource()==b1){
 zt=l1.getText();
  z=zt+"1";
  l1.setText(z);
}
if(e.getSource()==b2){
zt=l1.getText();
z=zt+"2";
l1.setText(z);
}
if(e.getSource()==b3){
  zt=l1.getText();
  z=zt+"3";
  l1.setText(z);
}
if(e.getSource()==b4){
  zt=l1.getText();
  z=zt+"4";
  l1.setText(z);
}
if(e.getSource()==b5){
  zt=l1.getText();
  z=zt+"5";
  l1.setText(z);
}
if(e.getSource()==b6){
  zt=l1.getText();
  z=zt+"6";
  l1.setText(z);
}
if(e.getSource()==b7){
  zt=l1.getText();
  z=zt+"7";
  l1.setText(z);
}
if(e.getSource()==b8){
  zt=l1.getText();
  z=zt+"8";
  l1.setText(z);
}
if(e.getSource()==b9){
  zt=l1.getText();
  z=zt+"9";
  l1.setText(z);
}
if(e.getSource()==b0){
  zt=l1.getText();
  z=zt+"0";
  l1.setText(z);
}

if(e.getSource()==bpts){  //ADD DECIMAL PTS
  zt=l1.getText();
  z=zt+".";
  l1.setText(z);
}
if(e.getSource()==bneg){ //FOR NEGATIVE
  zt=l1.getText();
  z="-"+zt;
  l1.setText(z);
}

if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}
                //AIRTHMETIC BUTTON
if(e.getSource()==badd){                     //FOR ADDITION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=1;
}
if(e.getSource()==bsub){                    //FOR SUBTRACTION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=2;
}
if(e.getSource()==bmult){                   //FOR MULTIPLICATION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=3;
}
if(e.getSource()==bdiv){                   //FOR DIVISION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=4;
}
if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=5;
}
                         //RESULT BUTTON
if(e.getSource()==bcalc){          
  try{
    num2=Double.parseDouble(l1.getText());
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2; 
  if(check==5)
    xd =num1%num2;    
  l1.setText(String.valueOf(xd));
}
                        //FOR CLEARING THE LABEL and Memory
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   z="";
   l1.setText(z);
   } 

}  
//MAIN METHOD where objects of MyCalc is instantaiated
 public static void main(String args[]){  
       new MyCalc();  
   }
}  


SO what I did is just implemented ActionListenerinterface in our MyCalc class and in its constructor i Register the AWT components with the Listener and done EventHandling using actionPerformed method.
OUR all the logic part in written in this actionPerformed function only which we will see below:

LOGIC PART
1.FOR NUMERIC BUTTON


if(e.getSource()==b1){ //b1 for number 1
 zt=l1.getText();
  z=zt+"1";// 1 will merged at the end of the previous value
  l1.setText(z);
}


when any of the numeric button pressed
whatever value in label l1 will be stored in a variable zt and then concatenated with the corresponding number and and then displayed in the label l1
for NEGATIVE and DECIMAL PTS Button we did it similarly

2.FOR AIRTHMETIC BUTTON


if(e.getSource()==badd){  //FOR ADDITION
    num1=Double.parseDouble(l1.getText());
  z="";
  l1.setText(z);
  check=1; // 1 for the adddition
}


NOW here we store the value of label l1 into a variable num1 after converting into double type which will be technically 1st number
and then and set label l1 to null

we will just use a check variable for getting that this particular airthmetic button(here +) was clicked so we can do this operation in our = button

3.FOR EQUALS BUTTON


if(e.getSource()==bcalc){          
    num2=Double.parseDouble(l1.getText());
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2; 
  if(check==5)
    xd =num1%num2;    
  l1.setText(String.valueOf(xd));
}


NOW again store the value of l1 into num2 variable which will be techincally 2nd number
and then check the value of variable check and then do corresponding operation and after that display result in label l1

4.FOR CLEAR BUTTON


 if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   z="";
   l1.setText(z);
   } 


here updated all the variable we use to its Default value 0
and set label l1 to null so that we can start our new calculation afterward

5.FOR BACKSPACE BUTTON


 if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}


here just updates the value in l1 by removing last digits using substring function
and handled one StringIndexOutOfBoundsException which occur when our value in label is null and still pressing back Button

6.SPECIAL ADDONS FEATURE
what I did is just handled one execption in EQUAL and all AIRTHMETIC Buttons and printed a desired message according to situtation
inside AIRTHMETIC BUTTONS:



try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }


inside EQUALS BUTTON:



try{
    num2=Double.parseDouble(l1.getText());
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }


when we was converting the value into the double value, BUT lets say that, label l1 has null value (i.e. label is empty) and we still pressed these button then it will generate NumberFormatException execption,
So handled that and printed desired message
For eg:
If I click1 then + and then i click - instead of some other numeric button, hence this an invalid format, and when -was clicked at that time label was null hence execption generated so just handled it and printed invalid format inlabel

SIMILARLY, when label is null,and = was clicked in that situation ENTER NUMBER FIRST will be displayed inside label

With this, we come to an end of this Java AWT Tutorial.
So just go through the code and try it. If you have any difficulty in understanding or using the code, then you ask by commenting below.
If you would like to download & run my CALC you can find here
I have uploaded both source code & executable jarfile

Thank You!
You can follow me on:
Twitter
Linkedin

profile
Timescale
Promoted

Image of Timescale

🚀 pgai Vectorizer: SQLAlchemy and LiteLLM Make Vector Search Simple
We built pgai Vectorizer to simplify embedding management for AI applications—without needing a separate database or complex infrastructure. Since launch, developers have created over 3,000 vectorizers on Timescale Cloud, with many more self-hosted.

Read full post →

Read More
Top comments (7)
Subscribe
pic
Add to the discussion
 
 
cenacr007_harsh profile image
KUMAR HARSH
•
Jun 18 '21

Nice Project


2
 likes
Like
Reply
 
 
rohitk570 profile image
ROHIT KUMAR 
•
Jun 18 '21

Thanks ☺️


2
 likes
Like
Reply
 
 
rash123 profile image
RASHMI VERMA
•
Jun 18 '21

Great👍👍


2
 likes
Like
Reply
 
 
rohitk570 profile image
ROHIT KUMAR 
•
Jun 18 '21

Thanks 😊😊


2
 likes
Like
Reply
 
 
jagoum profile image
Jagoum
•
Dec 13 '24

Wow very nice but i am really want to learn this since am an absolute beginner in java


1
 like
Like
Reply
 
 
geofrey_tuhaise_fabd731d5 profile image
Geofrey Tuhaise
•
Dec 2 '24

good to go!!!!


1
 like
Like
Reply
 
 
likitha_vasalmarri_493f98 profile image
Likitha Vasalmarri
•
Jan 3

Great


1
 like
Like
Reply
Code of Conduct • Report abuse
profile
Sentry
Promoted

Sentry image

See why 4M developers consider Sentry, “not bad.”
Fixing code doesn’t have to be the worst part of your day. Learn how Sentry can help.

Learn more

Read next
jetthoughts-dev profile image
The Future of Software Development and Web Development: Trends to Watch in 2025
JetThoughts Dev - Jan 17

cptbuuya profile image
Resilience & Adaptability
Ayub✌🏾 - Dec 14 '24

shpetimhaxhiu profile image
Detailed Tutorial: Crawling GitHub Repository Folders Without API
Shpetim Haxhiu - Dec 14 '24

luca1iu profile image
SQL Performance Tuning: Best Practices for Faster Queries
Luca Liu - Jan 15


ROHIT KUMAR
Follow
Programmer and Android developer, Loves to Blogg. On a Mission for reducing the complexity of learning by explaining complex things in the easiest possible way. “Every programmer is an author.”
Location
Bihar,India
Education
Btech 2k23
Work
Student
Joined
Jun 6, 2021
More from ROHIT KUMAR
For Loop & For-Each Loop
#java #beginners #tutorial #programming
Common Android Views Cheat Sheet
#android #beginners #xml #java
Android Basics: Using Relative layout
#android #java #beginners #androidstudio
profile
Sentry
Promoted

nextjs tutorial video

Youtube Tutorial Series 📺
So you built a Next.js app, but you need a clear view of the entire operation flow to be able to identify performance bottlenecks before you launch. But how do you get started? Get the essentials on tracing for Next.js from @nikolovlazar in this video series 👀

Watch the Youtube series



import java.awt.*;  
import java.awt.event.*;  
class MyCalc extends WindowAdapter implements ActionListener{ 
  Frame f; 
Label l1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
double xd;
double num1,num2,check;

MyCalc(){  
  f= new Frame("MY CALCULATOR");
// INSTANTIATING COMPONENETS 
l1=new Label(); 
l1.setBackground(Color.LIGHT_GRAY);
l1.setBounds(50,50,260,60);


b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
b6=new Button("6");
  b6.setBounds(190,270,50,50);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
b0=new Button("0");
  b0.setBounds(120,410,50,50);
bneg=new Button("+/-");
  bneg.setBounds(50,410,50,50);
bpts=new Button(".");
  bpts.setBounds(190,410,50,50);
bback=new Button("back");
 bback.setBounds(120,130,50,50);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
bsub=new Button("-");
  bsub.setBounds(260,270,50,50);
bmult=new Button("*");
  bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
  bdiv.setBounds(260,130,50,50);
bmod=new Button("%");
  bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
  bcalc.setBounds(245,410,65,50);
bclr=new Button("CE"); 
  bclr.setBounds(50,130,65,50);


b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);

bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this); 

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 

f.addWindowListener(this);
//ADDING TO FRAME   
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);

f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback);

f.setSize(360,500);  
f.setLayout(null);  
f.setVisible(true);  
} 
                     //FOR CLOSING THE WINDOW
public void windowClosing(WindowEvent e) {
  f.dispose();
}

public void actionPerformed(ActionEvent e){ 
  String z,zt;
                        //NUMBER BUTTON 
if(e.getSource()==b1){
 zt=l1.getText();
  z=zt+"1";
  l1.setText(z);
}
if(e.getSource()==b2){
zt=l1.getText();
z=zt+"2";
l1.setText(z);
}
if(e.getSource()==b3){
  zt=l1.getText();
  z=zt+"3";
  l1.setText(z);
}
if(e.getSource()==b4){
  zt=l1.getText();
  z=zt+"4";
  l1.setText(z);
}
if(e.getSource()==b5){
  zt=l1.getText();
  z=zt+"5";
  l1.setText(z);
}
if(e.getSource()==b6){
  zt=l1.getText();
  z=zt+"6";
  l1.setText(z);
}
if(e.getSource()==b7){
  zt=l1.getText();
  z=zt+"7";
  l1.setText(z);
}
if(e.getSource()==b8){
  zt=l1.getText();
  z=zt+"8";
  l1.setText(z);
}
if(e.getSource()==b9){
  zt=l1.getText();
  z=zt+"9";
  l1.setText(z);
}
if(e.getSource()==b0){
  zt=l1.getText();
  z=zt+"0";
  l1.setText(z);
}

if(e.getSource()==bpts){  //ADD DECIMAL PTS
  zt=l1.getText();
  z=zt+".";
  l1.setText(z);
}
if(e.getSource()==bneg){ //FOR NEGATIVE
  zt=l1.getText();
  z="-"+zt;
  l1.setText(z);
}

if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}
                //AIRTHMETIC BUTTON
if(e.getSource()==badd){                     //FOR ADDITION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=1;
}
if(e.getSource()==bsub){                    //FOR SUBTRACTION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=2;
}
if(e.getSource()==bmult){                   //FOR MULTIPLICATION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=3;
}
if(e.getSource()==bdiv){                   //FOR DIVISION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=4;
}
if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=5;
}
                         //RESULT BUTTON
if(e.getSource()==bcalc){          
  try{
    num2=Double.parseDouble(l1.getText());
    }catch(Exception f){
      l1.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2; 
  if(check==5)
    xd =num1%num2;    
  l1.setText(String.valueOf(xd));
}
                        //FOR CLEARING THE LABEL and Memory
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   z="";
   l1.setText(z);
   } 

}  
//MAIN METHOD where objects of MyCalc is instantaiated
 public static void main(String args[]){  
       new MyCalc();  
   }
}  


Thank you to our Diamond Sponsor Neon for supporting our community.

DEV Community — A constructive and inclusive social network for software developers. With you every step of your journey.

Home
DEV++
Podcasts
Videos
Tags
DEV Help
Forem Shop
Advertise on DEV
DEV Challenges
DEV Showcase
About
Contact
Free Postgres Database
Software comparisons
Code of Conduct
Privacy Policy
Terms of use
Built on Forem — the open source software that powers DEV and other inclusive communities.

Made with love and Ruby on Rails. DEV Community © 2016 - 2025.
