Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i< T; i++){
            int C = sc.nextInt();
            int D = sc.nextInt();
            int N = sc.nextInt();
            int z = 0;
            int count = 0;
            while(z<N){
                z = z + C;
                count++;
                if(z>=N)break;
                else{
                    z = z - D;
                }
            }
            System.out.println(count);
        }
