import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Exercicio09 {

	@Cacheable("produtos")
	public String buscarProduto(Long id) {
		System.out.println("Consultando no banco de dados o produto ID: " + id);
		return "Produto #" + id;
	}
}