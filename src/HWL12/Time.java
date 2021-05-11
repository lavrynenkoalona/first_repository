package HWL12;

public enum Time

    {  MORNING{
        public void timeGap(){
            System.out.println("6-11.59 am");
        }
    },
        LAUNCH{
            public void timeGap(){
                System.out.println("12-16.59 pm");
            }
        },
        DINNER{
            public void timeGap(){
                System.out.println("17-23.0 pm");
            }
        },
        NIGHT{
            public void timeGap(){
                System.out.println("23.0 pm-5.59 am");
            }
        };

        public abstract void timeGap();
    }

