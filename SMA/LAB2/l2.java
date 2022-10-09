public class MainActivity extends AppCompatActivity {

    Button btnclose;
    AlertDialog.Builder builder

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnchoice = findViewById(R.id.alertbutton);
        builder = new AlertDialog.Builder(this);

        btnchoice.nClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                builer.set("Alert!!")
                .setMessage("Whitch will you choose?")
                .setCancelable(true)
                .setPositiveButton("Yes",new DialogInterface.onClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface,int i){
                        //fa ceva 
                    }


                });

                    .setNegativeButton("Yes",new DialogInterface.onClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface,int i){
                        dialogInterface.cancel();
                    }
                    .show();
                    
                });
            }

            balert=findViewById(R.id.alertbutton);
            balert.setOnClickListener(new View.OnClickListener(){
                Toast.makeText( MainActivity thix,"Alert button has been presed",Toast.LENGTH_LONG),show();
            }
            
        });
    }

    public void onButtonShowPopupWindowClick(View view) {

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }