









@RestController
@RequestMapping("/evento")
public class EventoResources {

@Autowired
private EventoRepository er;

@GetMapping(produces="aplication/json")
public @responseBody Iterable<Evento> listaEventos(){
	Iterable<Evento> listaEventos = er.findAll();
	return listaEventos;
}

@PostMapping()
public Evento cadastraEvento(@RequestBody @Valid Evento evento) {
	return er.save(evento);
	
}

@DeleteMapping ()
public Evento deletaEvento(@RequestBody Evento evento) {
	er.delete(evento);
	return evento;
}

	
	
	
	
	
	
	
	
}
