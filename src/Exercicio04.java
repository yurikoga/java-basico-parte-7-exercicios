import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class Exercicio04 {

	@PreAuthorize("hasRole('ADMIN')")
	public void excluirUsuario(Long id) {
		System.out.println("Usuário " + id + " excluído pelo administrador.");
	}
}