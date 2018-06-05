package com.school.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UserManager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UserService userService;

    private User currentUser;

    public boolean isSignedIn() {
        return currentUser != null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public String signIn(String username, String password) {
        User user = userService.getUser(username);
        if (user == null) {
        	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Please enter a valid username"));
        	return "failure";
        }
        if (!password.equals(user.getPassword())) {
        	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Please enter a valid password"));
        	return "failure";
        }

        currentUser = user;
        
        if (currentUser.getIsAdmin())
        	return "admin";
        else
        	return "nonAdmin";
    }

    public void signOut() {
        // End the session, removing any session state, including the current user
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    public String save(User user) {
    	userService.saveUser(user);
    	currentUser = user;
    	if (currentUser.getIsAdmin())
        	return "admin";
        else
        	return "nonAdmin";
    }
}
