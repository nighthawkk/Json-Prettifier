import json

ugly_json = raw_input()
parsed = json.loads(ugly_json)
print(json.dumps(parsed, indent=2, sort_keys=True))


