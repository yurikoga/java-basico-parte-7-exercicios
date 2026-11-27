import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class Exercicio06 {

	@Operation(summary = "Busca um produto pelo ID")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "Produto encontrado com sucesso"),
			@ApiResponse(responseCode = "404", description = "Produto não encontrado")
	})
	@GetMapping("/{id}")
	public ResponseEntity<String> buscarProduto(@PathVariable Long id) {
		if (id == 1L) {
			return ResponseEntity.ok("Produto 1: Teclado Mecânico");
		}
		return ResponseEntity.notFound().build();
	}
}