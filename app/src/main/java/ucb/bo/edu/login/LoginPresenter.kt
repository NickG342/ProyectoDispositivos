package ucb.bo.edu.login

class LoginPresenter(val view: login):ILoginPresenter{
    override fun login(name: String, password: String) {
        if (name.isEmpty()){
            view.notifError("El campo nombre no puede estar vacio")
        }else if(password.isEmpty()){
            view.notifError("El campo contraseña no puede estar vacio")
        }else{
            view.goToHome()
        }
    }
}