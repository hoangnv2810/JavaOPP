package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.awt.print.Book;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class MainController implements Initializable {
    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonInsert;

    @FXML
    private Button buttonUpdate;

    @FXML
    private TableColumn<Books, Integer> columnId;

    @FXML
    private TableColumn<Books, String> columnTitle;

    @FXML
    private TableColumn<Books, String> columnAuthor;

    @FXML
    private TableColumn<Books, Integer> columnYear;

    @FXML
    private TableColumn<Books, Integer> columnPages;

    @FXML
    private TableView<Books> tableViewBooks;

    @FXML
    private TextField texFieldId;

    @FXML
    private TextField textFeildAuthor;

    @FXML
    private TextField textFeildPages;

    @FXML
    private TextField textFeildTitle;

    @FXML
    private TextField textFeildYear;

    @FXML
    private void handleButtonAction(ActionEvent event){
        if(event.getSource() == buttonInsert){
            insertBook();
        } else if(event.getSource() == buttonUpdate){
            updateBook();
        } else if(event.getSource() == buttonDelete){
            deleteBook();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showBooks();
    }

    public Connection getConnection(){
        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123456");
            return connection;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ObservableList<Books> getBooksList(){
        ObservableList<Books> bookList = FXCollections.observableArrayList();
        Connection cn = getConnection();
        String query = "SELECT* FROM books";
        Statement st;
        ResultSet rs;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(query);
            Books books;
            while (rs.next()){
                books = new Books(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getInt("year"), rs.getInt("pages"));
                bookList.add(books);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return bookList;
    }

    public void showBooks(){
        ObservableList<Books> list = getBooksList();
        columnId.setCellValueFactory(new PropertyValueFactory<Books, Integer>("id"));
        columnTitle.setCellValueFactory(new PropertyValueFactory<Books, String>("title"));
        columnAuthor.setCellValueFactory(new PropertyValueFactory<Books, String>("author"));
        columnYear.setCellValueFactory(new PropertyValueFactory<Books, Integer>("year"));
        columnPages.setCellValueFactory(new PropertyValueFactory<Books, Integer>("pages"));
        columnId.setStyle("-fx-alignment: CENTER");
        columnPages.setStyle("-fx-alignment: CENTER;");
        columnYear.setStyle("-fx-alignment: CENTER;");
        tableViewBooks.setItems(list);
    }

    private void insertBook(){
        String query = "INSERT INTO library.books VALUES (" + texFieldId.getText() + ",'" + textFeildTitle.getText() + "','"
                + textFeildAuthor.getText() + "'," + textFeildYear.getText() + "," + textFeildPages.getText() + ")";
        Connection cn = getConnection();
        Statement st;
        try {
            st = cn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
        }
        showBooks();
    }

    private void updateBook(){
        String query = "UPDATE books SET title = '" + textFeildTitle.getText() + "', author = '" + textFeildAuthor.getText()
                + "', year = " + textFeildYear.getText() + ", pages = " + textFeildPages.getText() + " WHERE id = "+ texFieldId.getText() + "";
        Connection cn = getConnection();
        Statement st;
        try {
            st = cn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
        }
        showBooks();
    }

    private void deleteBook(){
        String query = "DELETE FROM books WHERE id = " + texFieldId.getText();
        Connection cn = getConnection();
        Statement st;
        try {
            st = cn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
        }
        showBooks();
    }

    @FXML
    void handleMouseAction(MouseEvent event) {
        Books book = tableViewBooks.getSelectionModel().getSelectedItem();
        texFieldId.setText(book.getId()+"");
        textFeildTitle.setText(book.getTitle());
        textFeildAuthor.setText(book.getAuthor());
        textFeildYear.setText(book.getYear()+"");
        textFeildPages.setText(book.getPages()+"");
    }
}
