car one= new car(50,50,125,100);
car two= new car(150,150,135,200);
car three= new car(350,350,155,300);
car four= new car(250,250,175,500);

int x=200;
int y=499;
void setup(){
size(500, 500);
}

void draw(){
  
  
background(0,0,200);
fill(0, 255, 0);
ellipse(100, 100, 50, 50);
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
            y-=5;
        }
        else if(keyCode == DOWN && y<500)
        {
          y+= 5;
        }
        else if(keyCode == RIGHT&& x<500)
        {
            x+=5;
        }
        else if(keyCode == LEFT&& x>0)
        {
            x-=5;
        }
        
    }

}


class car{
int carx;
int cary;
int size;
int speed;

public car(int carx,int cary, int size, int speed){
this.carx=carx;
this.cary=cary;
this.size=size;
this.speed=speed;
}
void display()
  {
    fill(0,255,0);
    rect(x , y,  size, 50);
  }
}
