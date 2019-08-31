car one= new car(50,50,125,4);
car two= new car(150,150,135,4);
car three= new car(350,350,155,3);
car four= new car(250,250,175,3);

int x=250;
int y=459;
void setup(){
size(500, 500);
}

void draw(){
  boolean l=intersects(one);
 boolean pont=intersects(two);
 boolean ronch=intersects(three);
 boolean sid=intersects(four);
 if (l==true||pont==true||ronch==true||sid==true){
 x=250;
y=459;
 }
  one.moveleft();
  two.moveright();
  three.moveleft();
  four.moveright();
background(0,0,200);
fill(0, 255, 0);
ellipse(x, y, 40, 40);
one.display();
  two.display();
  three.display();
  four.display();
 
 
}
void keyPressed()
{
    if(key == CODED){
        if(keyCode == UP && y>0)
        {
            y-=15;
        }
        else if(keyCode == DOWN && y<500)
        {
          y+= 15;
        }
        else if(keyCode == RIGHT&& x<500)
        {
            x+=15;
        }
        else if(keyCode == LEFT&& x>0)
        {
            x-=15;
        }
        
    }

}


public class car{
int carx;
int cary;
int size;
int speed;
int getcarx(){
return carx;

}
int getcary(){

return cary;
}

int getsize(){

return size;
}
public car(int carx,int cary, int size, int speed){
this.carx=carx;
this.cary=cary;
this.size=size;
this.speed=speed;
}
void moveleft(){
carx=carx-speed;
if(carx<-size){
carx=500+size;
}
}
void moveright(){
carx=carx+speed;
if(carx>500+size){
carx=-size;
}
}
void display()
  {
    fill(250,0,0);
    rect(carx , cary,  size, 50);
  }
}
boolean intersects(car car) {
      if ((Y > car.getcary() && Y < car.getcary()+50) && (X > car.getcarx() && X < car.getcarx()+car.getsize()))
      {
             return true;
      }
      else 
      {
             return false;
      }}
