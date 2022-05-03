import java.util.*;
class Video{
    String videoName;
    boolean checkout;
    int rating;
    
    Video(String name){
        videoName=name;
    }
    
    String getName(){
        return videoName;
    }
    
    void doCheckout(){
        checkout=true;
    }
    
    void doReturn(){
        checkout=false;
    }
    
    void receiveRating(int rating){
        this.rating=rating;
    }
    
    int getRating(){
        return rating;
    }
    
    boolean getCheckout(){
        return checkout;
    }
}

class VideoStore{
    Video[] store = new Video[1];
    
    int checkVideo(String name){
        int f=0;
        
        try{
            for(Video video:store){
            if(video.getName().equals(name)){
                f=1;
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        return f;
    }
    
    void addVideo(String name){
        // int size;
        Video video = new Video(name);
        // try{
        //     size=store.length;
        // }catch(Exception e){
        //     size=0;
        // }
        store[0] = video;
        // Video[] newStore = new Video[size+1];
        // newStore[size]=video;
        // store=newStore;
    }
    
    void doCheckout(String name){
        for(Video video : store){
            if(video.getName().equals(name)){
                video.doCheckout();
            }
        }
    }
    
    void doReturn(String name){
        for(Video video : store){
            if(video.getName().equals(name)){
                video.doReturn();
            }
        }
    }
    
    void receiveRating(String name, int rating){
        for(Video video : store){
            if(video.getName().equals(name)){
                video.receiveRating(rating);
            }
        }
    }
    
    void listInventory() {
		if (store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video video : store) {
			System.out.print("---------------------------------------------------------------------------");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getCheckout(),video.getRating());
			System.out.println("---------------------------------------------------------------------------");
		}
	}
    
}

public class VideoLauncher{

     public static void main(String[] args) {	
		int input = 0;
		Scanner scan = new Scanner(System.in);
		VideoStore videoStore = new VideoStore();

		while(input !=6) {
			System.out.println("\n1. Add Videos : "+"\n"+"2. Check Out Video : "+"\n"+"3. Return Video : "+
					   "\n"+"4. Receive Rating : "+"\n"+"5. List Inventory : "+"\n"+"6. Exit : ");
			System.out.print("Enter Your Choice (1..6) : ");
			
			String name;
			input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1: 
				System.out.print("Enter the name of video you want to add: ");
				name = scan.nextLine();
				videoStore.addVideo(name);
				System.out.print("video "+ name + " added successfully.");
				break;
					
			case 2: 
				System.out.print("Enter the name of video you want to check out: ");
				name = scan.nextLine();
				if(videoStore.checkVideo(name) == 0) {
					System.out.print("Video does not exist");
				}
				else {
					videoStore.doCheckout(name);
					System.out.print("video "+ name + " checked out successfully.");
				}
				break;
					
			case 3: 
				System.out.print("Enter the name of video you want to return: ");
				name = scan.nextLine();
				if(videoStore.checkVideo(name) == 0) {
					System.out.print("Video does not exist");
				}
				else {
					videoStore.doReturn(name);
					System.out.print("video "+ name + " returned successfully.");
				}			
				break;
				
			case 4: 
				System.out.print("Enter the name of video you want to rate: ");
					name = scan.nextLine();
					if(videoStore.checkVideo(name) == 0) {
						System.out.print("Video does not exist");
					}
					else{
						System.out.print("Enter the rating for this video: ");
						int rating = scan.nextInt();
						videoStore.receiveRating(name, rating);
						System.out.print("Rating "+rating+" has been mapped to video "+ name +".");
					}
					break;
					
			case 5: 
				videoStore.listInventory();
				break;
				
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
		}
	}
	
}