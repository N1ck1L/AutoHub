package com.example.first;
import classes.DatabaseHandler;
import classes.database.Car;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class homeadmin_showrrom_updateentry_updatewindowController implements Initializable {


    @FXML
    private ImageView menuexit;

    @FXML
    private AnchorPane slider;

    @FXML
    private ImageView menu;
    @FXML
    private HBox showroombox;

    @FXML
    private HBox companybox;

    @FXML
    private AnchorPane addentrypane;
    @FXML
    private AnchorPane updateentrypane;

    @FXML
    public Stage stage;
    public Scene scene;
    public Parent root;

    @FXML
    private TextField idfield;
    @FXML
    private TextField namefield;
    @FXML
    private TextField ctypefield;
    @FXML
    private TextField etypefield;
    @FXML
    private TextField ttypefield;
    @FXML
    private TextField ftypefield;
    @FXML
    private TextField mileagefield;
    @FXML
    private TextField pricefield;

    @FXML
    private TextField showid;
    @FXML
    private TextField number;
    @FXML
    private Button confirm;
    @FXML
    private Label message;

    public String update_id;

    public String update_name;

    public String update_type;

    public String update_engine;

    public String update_transmission;

    public String update_fuel;

    public String update_mileage;

    public String update_price;

    public String update_showroomid;

    public String update_number;


    ;

    public void initialize(URL location, ResourceBundle resources){
        //exit.setOnMouseClicked(event ->{
        //    System.exit(0);
        //})
        //homeadmin_showroom_updateentryController updateobject = new homeadmin_showroom_updateentryController();
        //idfield.setText(updateobject.update_id);
        idfield.setEditable(false);
        confirm.setDisable(true);
        slider.setTranslateX(0);

        menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(false);
                menuexit.setVisible(true);
            });
        });

        menuexit.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(true);
                menuexit.setVisible(false);
            });
        });

    }

    public void setUpdateId(String update_id,String update_name,String update_type,String update_engine,String update_transmission,String update_fuel,String update_mileage,String update_price,String update_showroomid,String update_number) {
        this.update_id = update_id;
        idfield.setText(update_id);

        this.update_name = update_name;
        namefield.setText(update_name);

        this.update_type = update_type;
        ctypefield.setText(update_type);

        this.update_engine = update_engine;
        etypefield.setText(update_engine);

        this.update_transmission = update_transmission;
        ttypefield.setText(update_transmission);

        this.update_fuel = update_fuel;
        ftypefield.setText(update_fuel);

        this.update_mileage = update_mileage;
        mileagefield.setText(update_mileage);

        this.update_price = update_price;
        pricefield.setText(update_price);

        this.update_showroomid = update_showroomid;
        showid.setText(update_showroomid);

        this.update_number = update_number;
        number.setText(update_number);
    }

    public void showroom(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_showroom_addentry.fxml"));
        root = loader.load();

        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void company(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_company_viewemployee.fxml"));
        root = loader.load();
        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void account(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_account.fxml"));
        root = loader.load();
        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addentry(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_showroom_addentry.fxml"));
        root = loader.load();

        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void updateentry(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_showroom_updateentry.fxml"));
        root = loader.load();

        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void viewcontent(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_showroom_viewcontent.fxml"));
        root = loader.load();

        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void deletecontents(ActionEvent event)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/first/homeadmin_showroom_deleteentry.fxml"));
        root = loader.load();
        System.out.println("viewcontent");

        //homeController home = loader.getController();
        //home.display(username,pass);
        //Parent root = FXMLLoader.load(getClass().getResource("/com/example/first/login.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setWidth(1100);
        stage.setHeight(700);
        stage.centerOnScreen();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void done(ActionEvent event)throws Exception{
        String id = idfield.getText();
        String name = namefield.getText();
        String cartype = ctypefield.getText();
        String enginetype = etypefield.getText();
        String transtype = ttypefield.getText();
        String fueltype = ftypefield.getText();
        String mileage = mileagefield.getText();
        String price = pricefield.getText();

        if(id.equals("")  || name.equals("") || cartype.equals("") || enginetype.equals("") || transtype.equals("") || fueltype.equals("") || mileage.equals("")|| price.equals("")){
            confirm.setDisable(true);
            message.setText("enter all credentials");
        }
        else{
            confirm.setDisable(false);
            message.setText("confirm to add to database");
        }
    }

    public void confirm(ActionEvent event) throws Exception{
        String id = idfield.getText();
        String name = namefield.getText();
        String cartype = ctypefield.getText();
        String enginetype = etypefield.getText();
        String transtype = ttypefield.getText();
        String fueltype = ftypefield.getText();
        String mileage = mileagefield.getText();
        String price = pricefield.getText();
        String showroomid = showid.getText();
        String count = number.getText();

        Car car = new Car();
        car.CarID = id;
        car.Name = name;
        car.EngineType = enginetype;
        car.CarType = cartype;
        car.TransmissionType = transtype;
        car.FuelCapacity = fueltype;
        car.Mileage = mileage;
        car.Price = price;
        car.ShowroomID=showroomid;
        car.Count=count;

        DatabaseHandler.generateSQLQuery("UpdateCar", car, car.CarID);


    }







}
