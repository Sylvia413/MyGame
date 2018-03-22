package MyGame;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
public class MainWindowFrame extends JFrame  
{  
    public MainWindowFrame()  
    {  
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);  
        setResizable(false);//�������ô�С  
  
        infoPanel=new InfoPanel();  
        gamePanel=new GamePanel();  
        timer=new Timer(500,new timeActionListener());//�½�һ����ʱ������ÿ0.5s����һ��  
  
        Container contentPane=getContentPane();  
  
        contentPane.add(infoPanel,BorderLayout.WEST);  
        contentPane.add(gamePanel,BorderLayout.CENTER);  
  
        //ȫ�ּ��̼���¼�  
        Toolkit toolkit = Toolkit.getDefaultToolkit();  
        toolkit.addAWTEventListener(new ImplAWTEventListener(), AWTEvent.KEY_EVENT_MASK);  
  
    }  
  
    public static void startTimer()  
    {  
        timer.start();  
    }  
    public static void stopTimer()  
    {  
        timer.stop();  
    }  
    private static Timer timer;  
    //ÿ����һ�Σ�����������ƶ�һ��  
    private class timeActionListener implements ActionListener  
    {  
        public void actionPerformed(ActionEvent e)  
        {  
            gamePanel.move(DIRECTION_NONE);  
            infoPanel.setScore(gamePanel.checkLine());  
            infoPanel.repaint();  
        }  
    }  
    //ȫ���¼���������ؼ�������  
    class ImplAWTEventListener implements AWTEventListener  
    {  
        @Override  
        public void eventDispatched(AWTEvent event) {  
            if (event.getClass() == KeyEvent.class) {  
                // ��������¼��Ǽ����¼�.  
                KeyEvent keyEvent = (KeyEvent) event;  
                if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {  
                    //����ʱ��Ҫ��������  
                    keyPressed(keyEvent);  
                } else if (keyEvent.getID() == KeyEvent.KEY_RELEASED) {  
                    //�ſ�ʱ��Ҫ��������  
                    keyReleased(keyEvent);  
                }  
            }  
        }  
  
        private void keyPressed(KeyEvent e)  
        {  
            int keyCode=e.getKeyCode();  
            if(keyCode==KeyEvent.VK_LEFT)  
            {  
                gamePanel.move(DIRECTION_LEFT);  
                infoPanel.setScore(gamePanel.checkLine());  
            }  
            else if(keyCode==KeyEvent.VK_RIGHT)  
            {  
                gamePanel.move(DIRECTION_RIGHT);  
                infoPanel.setScore(gamePanel.checkLine());  
            }  
            else if(keyCode==KeyEvent.VK_UP)  
            {  
                gamePanel.changePosition();  
                infoPanel.setScore(gamePanel.checkLine());  
            }  
            else if(keyCode==KeyEvent.VK_DOWN)  
            {  
                gamePanel.moveToBottom();  
                infoPanel.setScore(gamePanel.checkLine());  
            }  
        }  
        private void keyReleased(KeyEvent event) {}  
    }  
  
  
    InfoPanel infoPanel;  
    GamePanel gamePanel;  
    private final int DEFAULT_WIDTH=550;  
    private final int DEFAULT_HEIGHT=633;  
    private int DIRECTION_LEFT=-1;  
    private int DIRECTION_RIGHT=1;  
    private int DIRECTION_NONE=0;  
}  
