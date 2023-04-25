package com.example.fabrics.demo.service;


@Service
public class fabricsservice {

	@Autowired
	fabricsRepository fabrepo;
	public List<fabrics> main(){
		return fabrepo.findAll();
	}
	public fabrics sub (fabrics fab) {
		return fabrepo.save(fab);
	}
	public fabrics dub(fabrics fab) {
		return fabrepo.save(fab);
	}
	public void del(int cost)
	{
		fabrepo.deleteById(cost);
	}
	
}
