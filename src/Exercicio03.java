import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Exercicio03 {
	public static void main(String[] args) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaPura = "MinhaSenha@2026";
		String hashSalvo = encoder.encode(senhaPura);

		System.out.println("Hash gerado: " + hashSalvo);
		System.out.println("Senha correta? " + encoder.matches("MinhaSenha@2026", hashSalvo));
		System.out.println("Senha errada? " + encoder.matches("SenhaErrada", hashSalvo));
	}
}