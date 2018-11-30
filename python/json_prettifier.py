import json

ugly_json = raw_input()
pretty_json = json.loads(ugly_json)
print(json.dumps(pretty_json, indent=2, sort_keys=True))


